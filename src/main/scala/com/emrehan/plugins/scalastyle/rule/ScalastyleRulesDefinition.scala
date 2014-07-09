/*
 * SonarQube Scalastyle Plugin
 * Copyright (C) 2014 Emrehan Tuzun
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package com.emrehan.plugins.scalastyle.rule

import com.emrehan.plugins.scalastyle.language.Scala
import org.sonar.api.server.rule.RulesDefinition.Context
import org.sonar.api.server.rule.{RulesDefinition, RulesDefinitionXmlLoader}

/**
 * This class creates rules from the rules.xml file
 */
class ScalastyleRulesDefinition(xmlLoader: RulesDefinitionXmlLoader) extends RulesDefinition {

  override def define(context: Context) {
    val scalastyleRepo = context.createRepository(ScalastyleRule.RulesRepoName, Scala.key).setName(ScalastyleRule.RulesRepoName)
    xmlLoader.load(scalastyleRepo, getClass.getResourceAsStream(ScalastyleRule.RulesXmlDirectory), "UTF-8")
    scalastyleRepo.done
  }
}

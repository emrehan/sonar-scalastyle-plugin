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
import org.sonar.api.profiles.{ProfileDefinition, RulesProfile}
import org.sonar.api.rules.{Rule, RulePriority}
import org.sonar.api.utils.ValidationMessages

/**
 * This class creates a quality profile for Scala
 */
class ScalastyleQualityProfile extends ProfileDefinition {
  override def createProfile(validation: ValidationMessages): RulesProfile = {
    val profile = RulesProfile.create(ScalastyleRule.ProfileName, Scala.key)
    profile.activateRule(Rule.create(ScalastyleRule.RulesRepoName, "line.contains.tab"), RulePriority.MAJOR)
    profile.activateRule(Rule.create(ScalastyleRule.RulesRepoName, "file.size.limit"), RulePriority.MAJOR)
    profile
  }
}



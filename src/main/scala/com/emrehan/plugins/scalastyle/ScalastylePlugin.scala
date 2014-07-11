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
package com.emrehan.plugins.scalastyle

import com.emrehan.plugins.scalastyle.language._
import com.emrehan.plugins.scalastyle.rule._
import com.emrehan.plugins.scalastyle.sensor._
import org.sonar.api.{Extension, SonarPlugin}

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
 * This is the entry point which calls the extensions
 */
class ScalastylePlugin extends SonarPlugin {
  override def getExtensions: java.util.List[Class[_ <: Extension]] = {
    ListBuffer(
      classOf[Scala],
      classOf[ScalastyleRulesDefinition],
      classOf[ScalastyleQualityProfile],
      classOf[ScalastyleExecutor],
      classOf[ScalastyleSensor]
    )
  }

  override val toString = getClass.getSimpleName
}


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
package com.emrehan.plugins.scalastyle.language

import org.sonar.api.resources.AbstractLanguage

/**
 * This class defines Scala as a language for SonarQube
 */
object Scala {
  val key = "scala"
  val name = "Scala"
  val fileExtensions = Array(".scala")
}

class Scala extends AbstractLanguage(Scala.key, Scala.name) {
  override val getFileSuffixes = Scala.fileExtensions
}

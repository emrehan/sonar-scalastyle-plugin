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
 package com.emrehan.plugins.scalastyle.sensor

import java.io.File

import com.emrehan.plugins.scalastyle.ScalastyleConstants
import org.scalastyle.{Directory, ScalastyleChecker, ScalastyleConfiguration}
import org.slf4j.LoggerFactory
import org.sonar.api.BatchExtension
import org.sonar.api.config.Settings
import org.sonar.api.utils.TimeProfiler

import scala.io.Source

 class ScalastyleExecutor(settings: Settings) extends BatchExtension {

  val logger = LoggerFactory.getLogger(getClass)

  def execute {
    val profiler = new TimeProfiler().start("Execute Scalatyle")

    // TODO: create Configuration from ActiveRules
    val sourceFiles =  Seq(new File(settings.getString("sonar.sources")))
    val configXml = Source.fromInputStream(getClass.getResourceAsStream(ScalastyleConstants.ConfigXmlDirectory)).mkString
    val configuration = ScalastyleConfiguration.readFromString(configXml)
    val messages = new ScalastyleChecker().checkFiles(configuration, Directory.getFiles(None, sourceFiles))

    // TODO: remove from the release
    logger.info("Scalastyle Messages:")
    println(messages.mkString("\n"))

    profiler.stop
  }
}
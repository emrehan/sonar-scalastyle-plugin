# Sonar Scalastyle Plugin
This plugin integrates Scalastyle with SonarQube.

## Building and Deploying Intructions
Build the project with maven 
```
mvn clean install
```

Then copy the **sonar-scalastyle-plugin-0.1-SNAPSHOT.jar** under target directory of the plugin to extensions/plugins directory of SonarQube and restart your SonarQube server. Then run sonar-runner.

##### SonarQube 4.3 Instructions
In SonarQube 4.3, if you modify the plugin you may need to set a new Quality Profile name or load the plugin to a fresh SonarQube server to experience the changes.

##### SonarQube 4.4 Instructions
In case you update the quality profiles of the plugin just hit "Restore Built-in Profiles".

For more information on running SonarQube you can refer to http://docs.codehaus.org/display/SONAR/Getting+Started and http://docs.codehaus.org/display/SONAR/Setup+and+Upgrade

___

Supports SonarQube 4.3+

Build with Maven 3.2.2, JVM 1.8, Scalastyle 0.5.0 and SonarQube 4.4-RC2

# Sonar Scalastyle Plugin
This plugin integrates Scalastyle with SonarQube.

## Building and Deploying Intructions
Build the project with maven 
```
mvn clean install
```

After the successful build, copy the **sonar-scalastyle-plugin-0.1-SNAPSHOT.jar** under extensions/plugins directory of SonarQube and restart your SonarQube server. Then run the sonar-runner.

For more information you can refer to http://docs.codehaus.org/display/SONAR/Getting+Started and http://docs.codehaus.org/display/SONAR/Setup+and+Upgrade

Build with Maven 3.2.2, JVM 1.8, Scalastyle 0.5.0 and SonarQube 4.3.2

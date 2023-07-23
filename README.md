# Log4j2 Project
# Log4J Configuration and myTimerLoggings Java Application

This project demonstrates the usage of Log4J2 for logging configuration in XML format for a Java application. Additionally, it includes a Java class called `myTimerLoggings.java`, which performs logging at three different levels (Debug, Info, Error) with specific time increments for each level.

## Features

- **Log Levels**: The application logs messages at three different levels - Debug, Info, and Error - as specified in the project instructions.

- **Time Display**:
  - For Debug logs, the application displays time with seconds' precision, incrementing every second (e.g., 20:27:00, 20:27:01, 20:27:02).
  - For Info logs, the application displays time with minutes' precision, incrementing every minute (e.g., 20:28:00, 20:29:00, 20:30:00).
  - For Error logs, the application displays time with hours' precision, incrementing every hour (e.g., 21:00:00, 22:00:00, 23:00:00).

- **Rolling Logs**: The log files are set to rollover to new files when reaching a size of 1MB. This helps manage log file sizes efficiently.

- **Log Cleanup**: All log files are configured to be deleted after one day, ensuring log data remains current and relevant.

- **File Output**: The log messages are written to files in the format "Timer-day-month-year.log" (e.g., Timer-23-07-2023.log) for easy identification and organization.

-
   ![error](https://github.com/aslihanaltun/log4j2Project/assets/70285896/443232c5-251a-4b60-9a93-f6406960e337)
   ![image](https://github.com/aslihanaltun/log4j2Project/assets/70285896/7d6dfaeb-40c3-4647-9ad4-81df1e58fa40)

## Usage

To use this application, follow these steps:
1. Clone the repository to your local machine.
2. Ensure you have Java Development Kit (JDK) and Log4J2 library installed.
3. Configure the Log4J2 XML file (`log4j2.xml`) to specify log file locations, rolling policies, and other settings.
4. Build and run the Java application to see the logging in action.

## Log4J Configuration

The Log4J2 configuration is done using the `log4j2.xml` file. Make sure to customize this file according to your preferences to control log levels, log file locations, rollover policies, etc.

Example configuration for log4j2.xml:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>org.example</groupId>
  <artifactId>log4jSon</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>log4jSon</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>20</maven.compiler.source>
    <maven.compiler.target>20</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-api</artifactId>
      <version>2.20.0</version>
    </dependency>
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-core</artifactId>
      <version>2.20.0</version>
    </dependency>
  </dependencies>
</project>


# JUnit 5 User Guide 

<h2>1. Overview</h2>
<h3>1.1. What is JUnit 5?<h3>
> JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

- The `JUnit Platform` serves as a foundation for launching testing frameworks on the JVM. It also
  defines the TestEngine API for developing a testing framework that runs on the platform.
  Furthermore, the platform provides a Console Launcher to launch the platform from the command
  line and a JUnit 4 based Runner for running any TestEngine on the platform in a JUnit 4 based
  environment. First-class support for the JUnit Platform also exists in popular IDEs (see IntelliJ IDEA,
  Eclipse, NetBeans, and Visual Studio Code) and build tools (see Gradle, Maven, and Ant).
- `JUnit Jupiter` is the combination of the new programming model and extension model for writing
   tests and extensions in JUnit 5. The Jupiter sub-project provides a TestEngine for running Jupiter
   based tests on the platform.

<h3>1.2. Supported Java Versions</h3>
- JUnit 5 requires Java 8 (or higher) at runtime. However, you can still test code that has been
  compiled with previous versions of the JDK.

<h3>1.3. Getting Help</h3>
- Ask JUnit 5 related question on [Stack Overflow](https://stackoverflow.com/questions/tagged/junit5) or chat with us on [Gitter](https://gitter.im/junit-team/junit5)

<h3>1.4. Getting Started</h3>
<h4>1.4.1. Downloading JUnit Artifacts</h4>
- To find out what artifacts are available for download and inclusion in your project, refer to
  `Dependency Metadata`. To set up dependency management for your build, refer to `Build Support` and the `Example Projects.`

<h4>1.4.2. JUnit 5 Features</h4>
sections of this User Guide, organized by topic.
- Writing Tests in JUnit Jupiter
- Migrating from JUnit 4 to JUnit Jupiter
- Running Tests
- Extension Model for JUnit Jupiter
- Advanced Topics
    - JUnit Platform Launcher API
    - JUnit Platform Test Kit

<h4>1.4.3. Example Projects</h4>
- For Gradle and Java, check out the `junit5-jupiter-starter-gradle` project.
- For Gradle and Kotlin, check out the `junit5-jupiter-starter-gradle-kotlin` project.
- For Gradle and Groovy, check out the `junit5-jupiter-starter-gradle-groovy` project.
- For Maven, check out the `junit5-jupiter-starter-maven` project.
- For Ant, check out the `junit5-jupiter-starter-ant` project.



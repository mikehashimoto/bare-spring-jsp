# bare-spring-jsp

Minimal code needed to create a Spring Boot Application with JSPs

## Basic Requirements

-   Must have Java JDK 11 or higher installed

## Start Up Spring Boot

In order to start the server run the following command:
`bare-spring-jsp> ./gradlew bootRun`

After startup, the following message will be displayed:

```
> Task :bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.18)

2024-09-24 17:25:44.257  INFO 79433 --- [           main] com.example.BareApplication              : Starting BareApplication using Java 21.0.2 on MacBookPro.localdomain with PID 79433 (/opt/dev/projects/github/bare-spring-jsp/build/classes/java/main started by michaelhashimoto in /opt/dev/projects/github/bare-spring-jsp)
2024-09-24 17:25:44.258  INFO 79433 --- [           main] com.example.BareApplication              : No active profile set, falling back to 1 default profile: "default"
2024-09-24 17:25:44.606  INFO 79433 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2024-09-24 17:25:44.611  INFO 79433 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-09-24 17:25:44.611  INFO 79433 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.95]
2024-09-24 17:25:44.694  INFO 79433 --- [           main] org.apache.jasper.servlet.TldScanner     : At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
2024-09-24 17:25:44.698  INFO 79433 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-09-24 17:25:44.698  INFO 79433 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 422 ms
2024-09-24 17:25:44.778  INFO 79433 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
2024-09-24 17:25:44.830  INFO 79433 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2024-09-24 17:25:44.834  INFO 79433 --- [           main] com.example.BareApplication              : Started BareApplication in 0.722 seconds (JVM running for 0.858)
```

## Additional Observations

-   The location to put JSP templates is in `src/main/webapps/WEB-INF/jsp`
	- This is configured by the `src/main/resources/application.properties`
-   The default location to put Java Classes is in `src/main/java/`

# JSR-330 example 

This is a Dependency Injection example running os Java SE. Its uses jboss weld (http://seamframework.org/Weld) as implementation. 

## JSR-330: Dependency Injection for Java

http://docs.oracle.com/javaee/6/api/javax/inject/package-summary.html

you can run the sample via starting the weld provided bootstap class (http://docs.jboss.org/weld/reference/latest/en-US/html/environments.html#d0e5406)

```
mvn compile exec:java -Dexec.mainClass=org.jboss.weld.environment.se.StartMain
```
# GitHub Actions + Apache Tomcat Practice Project

A minimal Maven web app (Servlet + JSP) that packages into a WAR file,
built for practicing GitHub Actions CI/CD pipelines with Apache Tomcat.

## Project layout

```
gha-tomcat-demo/
├── pom.xml
├── .gitignore
├── .github/workflows/ci-build-deploy.yml   # GitHub Actions pipeline
└── src/
    ├── main/
    │   ├── java/com/example/demo/HelloServlet.java
    │   └── webapp/
    │       ├── index.jsp
    │       └── WEB-INF/web.xml
    └── test/
        └── java/com/example/demo/SanityTest.java
```

## Build locally (optional, to confirm before pushing)

```bash
mvn clean package
```

This produces `target/gha-tomcat-demo.war`.

## Deploy manually to Tomcat (for a first sanity check)

1. Copy `target/gha-tomcat-demo.war` into Tomcat's `webapps/` folder.
2. Start/restart Tomcat.
3. Visit `http://localhost:8080/gha-tomcat-demo/` and
   `http://localhost:8080/gha-tomcat-demo/hello`.

See the accompanying instructions for the full GitHub Actions walkthrough.

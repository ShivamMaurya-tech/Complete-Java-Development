# JSP on Apache Tomcat (no Maven)

This workspace is a minimal JSP web application. It is deployed directly from
this folder by Tomcat; no Maven build is required.

## Run

1. Install a JDK and download the Windows ZIP distribution of Apache Tomcat 11.
2. Extract Tomcat to a folder you can write to.
3. Copy `tomcat-context.xml` to `<Tomcat folder>\conf\Catalina\localhost\jsp-demo.xml`.
4. Update the `docBase` in that file to this workspace's absolute path if the
   workspace was moved.
5. Run `<Tomcat folder>\bin\catalina.bat run`.
6. Open <http://localhost:8081/jsp-demo/>.

Press Ctrl+C in the Tomcat terminal to stop the server.

Tomcat 11 uses Jakarta APIs (`jakarta.*`). Existing projects that import
`javax.servlet.*` generally need Tomcat 9 instead, or a migration to Jakarta.

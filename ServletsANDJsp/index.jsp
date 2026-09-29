<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>JSP on Apache Tomcat</title>
</head>
<body>
    <main>
        <h1>JSP is running</h1>
        <p>Served by Apache Tomcat.</p>
        <p>Java version: <%= System.getProperty("java.version") %></p>
        <p>Server time: <%= new java.util.Date() %></p>
    </main>
</body>
</html>
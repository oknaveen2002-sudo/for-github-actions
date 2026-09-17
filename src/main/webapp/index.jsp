<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GitHub Actions + Tomcat Demo</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 60px; background: #f4f6f8; }
        .card { background: white; padding: 30px 40px; border-radius: 10px;
                box-shadow: 0 2px 8px rgba(0,0,0,0.1); max-width: 600px; }
        a { color: #2563eb; }
    </style>
</head>
<body>
    <div class="card">
        <h1>Hello from your CI/CD pipeline!</h1>
        <p>This WAR file was built automatically by a GitHub Actions workflow
           and deployed to Apache Tomcat.</p>
        <p>Try the servlet endpoint: <a href="hello">/hello</a></p>
    </div>
</body>
</html>

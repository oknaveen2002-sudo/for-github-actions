package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A minimal servlet used to verify that the WAR built by GitHub Actions
 * has been deployed correctly on Apache Tomcat.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head><title>GitHub Actions + Tomcat Demo</title></head>");
            out.println("<body style='font-family: Arial, sans-serif;'>");
            out.println("<h1>Deployment Successful!</h1>");
            out.println("<p>This page is served from a WAR file built by a GitHub Actions pipeline.</p>");
            out.println("<p>Server time: " + LocalDateTime.now() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

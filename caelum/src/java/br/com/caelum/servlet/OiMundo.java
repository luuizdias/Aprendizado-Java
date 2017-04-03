/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;

/**
 *
 * @author luiz.dias
 */
public class OiMundo extends HttpServlet{
    @Override
    public void log(String l){};
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, java.io.IOException{
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Oi Servlet</h1>");
        out.println("</body>");
        out.println("</html>");
        
    }
}


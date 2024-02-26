/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.teest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author heba
 */
public class NewServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pen =response.getWriter();
        response.setContentType("text/xml");
//         response.setContentType("text/xml");
//          response.setContentType("text/html");
        pen.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"<Response>\n" +
"<Say voice=\"woman\">Hello heba how are you</Say>\n" +
"<Play>http://demo.twilio.com/docs/classic.mp3</Play>\n" +
"</Response>");     
        
    }
}

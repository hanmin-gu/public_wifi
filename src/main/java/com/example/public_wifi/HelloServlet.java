package com.example.public_wifi;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<br>");
        out.println("<table border= "1" >");
        out.println("<tr>");
        out.println("<td> helloqqq <td/>" );
        //out.println("<th style =" + "  " color :black" " + ">" + "hello" + "</td>");
        /*
        out.println("<th style=" + "color: white>" + "거리" + "</td>");
        out.println("<th style=" + "color: white>" + "관리번호" + "</td>");
        out.println("<th style=" + "color: white>" + "자치구" + "</td>");
        out.println("<th style=" + "color: white>" + "와이파이명" + "</td>");
        out.println("<th style=" + "color: white>" + "도로명주소" + "</td>");
        out.println("<th style=" + "color: white>" + "상세주소" + "</td>");
        out.println("<th style=" + "color: white>" + "설치위치" + "</td>");
        out.println("<th style=" + "color: white>" + "설치유형" + "</td>");
        out.println("<th style=" + "color: white>" + "설치기관" + "</td>");
        out.println("<th style=" + "color: white>" + "서비스구분" + "</td>");
        out.println("<th style=" + "color: white>" + "망종류" + "</td>");
        out.println("<th style=" + "color: white>" + "설치년도" + "</td>");
        out.println("<th style=" + "color: white>" + "설치외구분" + "</td>");
        out.println("<th style=" + "color: white>" + "WIFI접속환경" + "</td>");
        out.println("<th style=" + "color: white>" + "관리번호" + "</td>");
        out.println("<th style=" + "color: white>" + "X좌표" + "</td>");
        out.println("<th style=" + "color: white>" + "Y좌표" + "</td>");
        out.println("<th style=" + "color: white>" + "작업일자" + "</td>");
*/
        out.println("</tr>");
        out.println("</br>");
        out.println("</table>");

        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
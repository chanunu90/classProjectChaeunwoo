package com.app.springex;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

@WebServlet("/my")
@Log4j2
public class MyServlet extends HelloServlet {

    public MyServlet() {

    }
    @Override
    protected void doGet(
            HttpServletRequest Request ,
            HttpServletResponse Response )
            throws ServerException, IOException {

    log.info("MyServlet....겟으로 들어와요");

        Response.setContentType("text/html");

        PrintWriter out = Response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1> MyServlet </h1>");
        out.println("</body>");
        out.println("</html>");

    }
}

package trainingweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession(false);
        PrintWriter out=response.getWriter();
        if(session!=null){
            session.removeAttribute("username");
            session.invalidate();
            out.println("<a href=\"login.jsp\">"+"Login"+"</a>");
        }else{
            out.println("Please Login<br>");
            out.println("<a href=\"login.jsp\">"+"Login"+"</a>");
        }
    }

}

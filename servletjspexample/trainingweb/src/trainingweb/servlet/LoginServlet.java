package trainingweb.servlet;

import trainingweb.service.UserService;
import trainingweb.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter out=response.getWriter();
            String username= request.getParameter("username");
            String password=request.getParameter("password");
            UserService manager=new UserServiceImpl();
            Boolean flag=manager.verifyUsernameAndPassword(username, password);
            if(flag==true){
                HttpSession session=request.getSession(true);
                session.setAttribute("username", username);
                String uri= "main_menu.jsp";
                request.getRequestDispatcher(uri).forward(request, response);
//out.println("<html><body"+"<h1>Hi! Welcome "+username+"</h1></body></html>");
            }else{
                out.println("<html><body"+"<h1>"+"Invalid Credentials"+"</h1>"+"</body></html>");
                out.println("<a href=\"login.jsp\">"+"Login"+"</a>");
            }
        }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }
}

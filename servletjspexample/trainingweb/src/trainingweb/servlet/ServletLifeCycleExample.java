package trainingweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/myservlet")
public class ServletLifeCycleExample implements Servlet {

    ServletConfig config = null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("ServletLifeCycleExample Servlet is initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
            res.setContentType("text/html");
        LocalDateTime ldt = LocalDateTime.now();
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b><h2>Servlet Lifecycle Example</h2>"+ldt+"</b>");
        out.print("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "I am ServletLifeCycleExample servlet";
    }

    @Override
    public void destroy() {
            System.out.println("ServletLifcecycleExample is Destroyed");
    }
}

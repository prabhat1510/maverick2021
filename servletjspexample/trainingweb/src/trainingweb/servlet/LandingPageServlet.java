/**
 * 
 */
package trainingweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trainingweb.entities.Member;
import trainingweb.service.MemberService;

/**
 * @author admi
 *
 */
@WebServlet("/index")
public class LandingPageServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1167177567744081860L;
	
	private MemberService memberService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(getServletInfo());
		RequestDispatcher dispatcher =  req.getRequestDispatcher("example.jsp");
		dispatcher.forward(req, resp);
		
	}


}

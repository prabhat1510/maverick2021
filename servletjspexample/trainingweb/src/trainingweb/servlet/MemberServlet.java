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
@WebServlet("/memberServlet")
public class MemberServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1167177567744081860L;
	
	private MemberService memberService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/**
		int employeeId = Integer.parseInt(req.getParameter("employeeId"));
		employeeService.removeEmployee(employeeId);

		List<Employee> allEmployees = employeeService.findAllEmployees();
		req.setAttribute("allEmployees", allEmployees);
		RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		dispatcher.forward(req, resp);
		**/
		
		//int memberId =  Integer.parseInt(req.getParameter("memeberId"));

		//int memberId = Integer .parseInt(req.getParameter("id"));
		List<Member> allMembers = memberService.findAllMembers();
		req.setAttribute("allMembers", allMembers);
		RequestDispatcher dispatcher =  req.getRequestDispatcher("member.jsp");
		dispatcher.forward(req, resp);

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		Member member = new Member();
		member.setId(15);
		member.setName("Servlet Members");
		String message = memberService.addMember(member);
		req.setAttribute("message",message);
		RequestDispatcher dispatcher =  req.getRequestDispatcher("message.jsp");
		dispatcher.forward(req, resp);
	}
}

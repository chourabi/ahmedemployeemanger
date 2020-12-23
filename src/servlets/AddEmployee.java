package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.EmployeeManager;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/add.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		String fullname = request.getParameter("fullname");
		float salary = Float.parseFloat(request.getParameter("salary"));
		String adddate = request.getParameter("adddate");
		
		
		EmployeeManager e = new EmployeeManager();
		
		e.addNewEmployee(fullname, salary, adddate);
		
		request.setAttribute("employees", e.getEmployees() );
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/employees.jsp").forward(request, response);
	}

}

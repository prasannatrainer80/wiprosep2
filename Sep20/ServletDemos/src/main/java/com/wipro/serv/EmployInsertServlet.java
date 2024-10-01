package com.wipro.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployInsertServlet
 */
public class EmployInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employ.setName(request.getParameter("name"));
		employ.setGender(request.getParameter("gender"));
		employ.setDept(request.getParameter("dept"));
		employ.setDesig(request.getParameter("desig"));
		employ.setBasic(Double.parseDouble(request.getParameter("basic")));
		PrintWriter out = response.getWriter();
		out.println("Employ No  " +employ.getEmpno() + "<br/>");
		out.println("Employ Name  " +employ.getName() + "<br/>");
		out.println("Gender  " +employ.getGender() + "<br/>");
		out.println("Department  " +employ.getDept() + "<br/>");
		out.println("Designation  " +employ.getDesig() + "<br/>");
		out.println("Basic  " +employ.getBasic() + "<br/><hr/>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.imooc.el;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/info")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teacher = request.getParameter("teacher");
		Student stu = new Student();
		stu.setName("всд╚");
		stu.setMobile(null);
		String grade = "A";
//		request.setAttribute("grade", "B");
//		request.getServletContext().setAttribute("grade", "C");
		HttpSession session = request.getSession();
		session.setAttribute("student", stu);
		session.setAttribute("grade", grade);
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		
		session.setAttribute("list",list);
//		request.setAttribute("student", stu);
//		request.setAttribute("grade", grade);
		request.getRequestDispatcher("/el_info.jsp").forward(request, response);
	}

}

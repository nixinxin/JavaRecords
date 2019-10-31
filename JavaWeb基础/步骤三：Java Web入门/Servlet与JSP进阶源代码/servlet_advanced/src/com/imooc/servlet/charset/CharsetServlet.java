package com.imooc.servlet.charset;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CharsetServlet
 */
@WebServlet("/charset/process")
public class CharsetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharsetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����Tomcat8.x�İ汾��Ĭ��get���������ľ���UTF-8�ĸ�ʽ���������ת��
		String ename = request.getParameter("ename");
		String address = request.getParameter("address");
		System.out.println(ename + ":" + address);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(ename + ":" + address);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding�������ڽ��������е��ַ���ת��ΪUTF-8
		request.setCharacterEncoding("UTF-8");
		// TODO Auto-generated method stub
		String ename = request.getParameter("ename");
		String address = request.getParameter("address");
		System.out.println(ename + ":" + address);
		//String utf8Ename = new String(ename.getBytes("iso-8859-1") , "utf-8");
		//String utf8Address = new String(address.getBytes("iso-8859-1") , "utf-8");
		//System.out.println(utf8Ename + ":" + utf8Address);
	}

}

package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.registerDao;
import com.dao.registerDaoImpl;
import com.model.register;

/**
 * Servlet implementation class searchController
 */
@WebServlet("/searchController")
public class searchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public searchController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empID2 = request.getParameter("empID");
		int empID = Integer.parseInt(empID2);

		registerDao rdao = new registerDaoImpl();
		List<register> lstreg = rdao.retrive(empID);
		register r = lstreg.get(0);
		HttpSession session = request.getSession();
		session.setAttribute("data", r);
		response.sendRedirect("searchsuccess.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

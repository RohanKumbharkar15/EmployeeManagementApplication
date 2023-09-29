package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.registerDao;
import com.dao.registerDaoImpl;
import com.model.register;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public registerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empID = (Integer.parseInt(request.getParameter("empID")));
		String empNAME = request.getParameter("empNAME");
		String empSALARY = request.getParameter("empSALARY");
		String empMOBILE = request.getParameter("empMOBILE");
		String empLOC = request.getParameter("empLOC");
		register robj = new register(empID, empNAME, empSALARY, empMOBILE, empLOC);
		List<register> lstreg = new ArrayList<register>();

		lstreg.add(robj);

		registerDao rdao = new registerDaoImpl();
		int i = rdao.create(lstreg);

		if (i > 0) {

			response.sendRedirect("registerSuccess.jsp");
		}

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

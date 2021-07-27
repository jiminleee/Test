package com.hm.bm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jm.login.LoginDAO;

@WebServlet("/DelBMController")
public class DelBMController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		markDAO.delBookmark(request);
		markDAO.seeAllBookmark(request);
		LoginDAO.Random(request);
		
		request.setAttribute("contentPage", "bookmark.jsp");
		request.setAttribute("sidePage", "side.jsp");
		request.getRequestDispatcher("home.jsp").forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

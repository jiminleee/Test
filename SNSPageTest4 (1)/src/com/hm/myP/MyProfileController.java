package com.hm.myP;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hm.bm.markDAO;
import com.jm.login.LoginDAO;

@WebServlet("/MyProfileController")
public class MyProfileController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		markDAO.getMyProfile(request); 
		markDAO.getMyPost(request);
		LoginDAO.Random(request);
		
		request.setAttribute("contentPage", "myProfilePage.jsp");
		request.setAttribute("sidePage", "side.jsp");
		request.getRequestDispatcher("home.jsp").forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

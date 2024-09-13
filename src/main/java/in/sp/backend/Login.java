package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/mylogin")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		String myemail= req.getParameter("email1");
		String mypassword= req.getParameter("pass1");
		if(myemail.equals("satish@gmail.com") && mypassword.equals("satish123")) {
			System.out.println("SUCCESS ꧁Sᴀтısн_฿нᴀɪ࿐");
			out.println("SUCCESS ꧁Sᴀтısн_฿нᴀɪ࿐");
		}else {
			System.out.println("FAILURE ꧁Sᴀтısн_฿нᴀɪ࿐");
			out.println("FAILURE");
		}
	}

}

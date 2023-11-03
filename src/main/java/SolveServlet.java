import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SolveServlet extends HttpServlet {

	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // Get the value of 'n' from the request parameter
	       // int n = Integer.parseInt(request.getParameter("n"));
		 

	        // Solve the N-Queens problem
//	        SolveServlet solver = new SolveServlet();
//	        int[][] solution = solver.solve();
//
//	        // Set the response type to JSON
//	        response.setContentType("application/json");
//	        response.setCharacterEncoding("UTF-8");

	        // Convert the solution to JSON
	        PrintWriter out = response.getWriter();
	        out.println("solution");
	        out.close();
	    }

	private int[][] solve() {
		// TODO Auto-generated method stub
		return null;
	}
	}
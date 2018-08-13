package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 	http://localhost:8888/Lecture-Web/servlet/table?row=3&col=4
 	
 	-------------------------------------------------
 	| cell(0,0) | cell(0,1) | cell(0,2) | cell(0,3) |
 	-------------------------------------------------
 	| cell(1,0) | cell(1,1) | cell(1,2) | cell(1,3) |
 	-------------------------------------------------
 	| cell(2,0) | cell(2,1) | cell(2,2) | cell(2,3) |
 	-------------------------------------------------

 	http://localhost:8000/Lecture-Web/servlet/table
 	  5 X 5 테이블
 	  
 	http://localhost:8000/Lecture-Web/servlet/table?col=2
 	  5 X 2 테이블
 */
@WebServlet("/table")
public class TableServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String srow = request.getParameter("row");
		String scol = request.getParameter("col");
		
		if(srow != null) {
			String row = "5";
		}
		if(scol != null) {
			String col = "5";
		}
		int row = Integer.parseInt(srow);
		int col = Integer.parseInt(scol);

		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		//StringBuilder sb = new StringBuilder();
		out.println("<HTML>");
		out.println("	<HEAD>");
		out.println("		<TITLE>table</TITLE>");
		out.println("	</HEAD>");
		out.println("	<BODY>");
		out.println("    <table>");
		for(int i=0; i<=row; i++) {
			out.println("		<tr>");
			for(int j=0; j<=col;j++) {
				out.println("			<td>");
				System.out.println("cell(" + i + "," + j + ")");
				out.println("| cell(" + i + "," + j + ") |");
				out.println("			</td>");
			}
			out.println("		</tr>");
		}
		out.println("    </table>");
		System.out.println((row+1) + "X" + (col+1) + "테이블");
		out.println("	</BODY>");
		out.println("</HTML>");
		
		out.flush();
		out.close();
		
	}
}

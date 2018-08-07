package kr.co.mlec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("출력");
		
		int row = 5;
		int col = 5;
		
		String inputRow = req.getParameter("row");
		String inputCol = req.getParameter("col");
		
		if(inputRow != null) {
			row = Integer.parseInt(inputRow);
		}
		if(inputCol != null) {
			col = Integer.parseInt(inputCol);
		}

		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("	<head>");
		sb.append("		<title>출력결과</title>");
		sb.append("	</head>");
		sb.append("	<body>");
		for(int i = 0; i < col; i++) {
			for(int k= 0; k<row; k++) {
				sb.append("---------------");
			}
			sb.append("<br>");
			for(int j = 0; j < row; j++) {
				sb.append("  | cell ( " + i + " ,  " + j +" )  "); 
			}
			sb.append("|<br>");
		}
		sb.append("	</body>");
		sb.append("</html>");
		
		out.println(sb.toString());
		out.flush();
		out.close();
	}

}

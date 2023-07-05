package backendWeb2.a01_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A04_Servlet_html
 */
public class A04_Servlet_html extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A04_Servlet_html() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print("<style>table { border-collapse : collapse; } td {text-align:center; border : 1px solid #888; font-size:20px;}</style>");
		
		out.print("<script>function call(e) {e.style.background = '#f0f';}</script>");
		out.print("<h2>테이블 생성<h2>");
		out.print("<table width='300px' height='300px'>");
		for(int i=1; i<=9; i++) {
			if(i%3 ==1) out.print("<tr>");
			out.print("<td onclick='call(this)'>" + i + "</td>");
			if(i%3 ==0) out.print("</tr>");
		}
		out.print("</table>");
		
		
		out.close();
	}

}

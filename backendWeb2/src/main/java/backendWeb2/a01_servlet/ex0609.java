package backendWeb2.a01_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ex0609 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ex0609() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		//servlet에서 반복문으로 7가지 무지개 색 h2를 만드세요
		out.print("<style>table { border-collapse : collapse; } td {text-align:center; border : 1px solid #888; font-size:20px;}</style>");
		
		out.print("<h3>반복문 - 무지개<h3>");
		for(int i=1; i<=7; i++) {
			out.print("<h2>color</h2>");
			
		}
		out.print("<script> let cArr = ['red', 'orange', 'yellow', 'green', 'skyblue', 'purple']; let h2 = document.querySelectorAll('h2');  for(let i =0; i<7; i++) {\r\n"
				+ "    h2[i].style.backgroundColor = cArr[i];\r\n"
				+ "}  </script>");
		
//		servlet에서 4X4테이블로 클릭시 @@번호 안녕하세요가 alert으로 로딩되게 하세요.
		out.print("<script>let td = document.querySelectorAll('td');\r\n"
				+ "function call(e) {\r\n"
				+ "    alert(e.innerText+ \" hi\");\r\n"
				+ "}</script>");
		out.print("<h3>테이블 생성<h3>");
		out.print("<table width='300px' height='300px'>");
		for(int i=1; i<=16; i++) {
			if(i%4 ==1) out.print("<tr>");
			out.print("<td onclick='call(this)'>" + i + "</td>");
			if(i%4 ==0) out.print("</tr>");
		}
		out.print("</table>");
		
		
		out.close();
	}

}

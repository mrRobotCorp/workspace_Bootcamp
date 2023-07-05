package backendWeb2.a01_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A03_Servlet_html
 */
public class A03_Servlet_html extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A03_Servlet_html() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. response : client에 전달하는 객체
		// 1. 코드에 한글 넣기 위한 설정. 전달할 때, 한글 encoding방식 중 utf-8 방식으로 처리
		response.setCharacterEncoding("utf-8");
		// 2. html 코드를 처리하기 위한 설정
		response.setContentType("text/html;charset=utf-8");
		
		// 3. Stream으로 출력 처리하는 객체
		PrintWriter out = response.getWriter();
		for(int i=1; i<=10; i++) {
			out.print("<h2>" + i + "번째 안녕하쇼\n");
		}
		
		// 4. 생성 후 Stream 객체 해제
		out.close();
		
		// ex) A04_Servlet_html.java 를 만들고
		// 1*3 테이블에 번호 넘버링해서 화면 출력
		
		
		
		
	}

}

package backendWeb2.a01_servlet;

import java.io.IOException;
import java.io.Writer;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A01_Servlet
 */
public class A01_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public A01_Servlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// jsp는 server()를 둘러싸고 있어서 처리된느 코드.
		// response 객체는 client에 특정한 코드를 전달할 때 사용됨
		// Stream 객체 중 쓰기 객체인 write 객체를 만들어 주어 client에
		// 쓴 내용을 전달
		Writer out = response.getWriter();
		out.write("hello friend");
	}

}

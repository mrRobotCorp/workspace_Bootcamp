package backendWeb2.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A08_AjaxController01
 */
public class A08_AjaxController01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A08_AjaxController01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청값
		String price = request.getParameter("price");
		if(price == null || price.equals("")) price = "0";
		String cnt = request.getParameter("cnt");
		if(cnt == null || cnt.equals("")) cnt = "0";
		
		int tot = Integer.parseInt(price) * Integer.parseInt(cnt);
		// 2. 모델 데이터 
		
		// 3. 화면 호출 (jsp/json 출력)
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		response.getWriter().print("합산 : " + tot);

		
	}

}

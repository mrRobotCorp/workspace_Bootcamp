package backendWeb2.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb2.z01_vo.Product;

/**
 * Servlet implementation class A09_AjaxController
 */
public class A09_AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A09_AjaxController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ex) A09_AjaxController.java
		//		요청값 : 물건명을 넘기고 화면에 구매한 물건 : ## 출력
		// 				요청값이 없으면 없네요 출력
		String pname = request.getParameter("pname");
		String priceS = request.getParameter("price");
		int price = 0;
		if(priceS != null && priceS.equals("")) price = Integer.parseInt(priceS);
		String cntS = request.getParameter("cnt");
		int cnt = 0;
		if(cntS != null && cntS.equals("")) cnt = Integer.parseInt(cntS);
		
		if(pname == null) {
			pname = "";
			response.getWriter().print("요청값이 없음");
			
		} else {
			response.getWriter().print("구매한 물건 : " + pname);
			
		}
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		
		Product p = new Product(pname, price, cnt);
		Gson g = new Gson();
		
		response.getWriter().print(g.toJson(p));
		
	}

}

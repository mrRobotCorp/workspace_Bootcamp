package backendWeb.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb.z01_vo.Product;

/**
 * Servlet implementation class Ex0705_02
 */
@WebServlet(name = "ex0705_02.do", urlPatterns = { "/ex0705_02.do" })
public class Ex0705_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex0705_02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String priceS = request.getParameter("price");
		int price = 0;
		
		if(priceS!=null&&!priceS.equals("")) 
			price = Integer.parseInt(priceS);
		String ratioS = request.getParameter("ratio");
		double ratio = 0;
		if(ratioS!=null&&!ratioS.equals(""))
			ratio = Double.parseDouble(ratioS);
		
		double tot = price - ( price * ratio);
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		response.getWriter().print("가격 : " + price + "\n할인율 : " + ratio
					+ "\n총계 : " + tot);
		
		Product p = new Product(price, ratio, tot);
		Gson g = new Gson();
		response.getWriter().print(g.toJson(p));
		
	}

}

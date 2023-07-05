package backendWeb2.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb2.z01_vo.Music;

/**
 * Servlet implementation class A10_AjaxController
 */
@WebServlet(name = "musicData.do", urlPatterns = { "/musicData.do" })
public class A10_AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A10_AjaxController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// A10_AjaxController.java
		// mname=@@&singer=@@pubyear=2020
		// Music 네 넘겨서 Json 데이터로 위 내용을 json 객체로 출력하게 처리
		String mname = request.getParameter("mname");
		String singer = request.getParameter("singer");
		String pubyearS = request.getParameter("pubyear");
		int pubyear = 0;
		if(pubyearS != null || !pubyearS.equals("")) {
			pubyear = Integer.parseInt(pubyearS);
		}
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		
		Music m01 = new Music(mname, singer, pubyear);
		Gson g = new Gson();
		
		response.getWriter().print(g.toJson(m01));
	
	}

}

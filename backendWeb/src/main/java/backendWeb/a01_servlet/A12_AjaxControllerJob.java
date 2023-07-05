package backendWeb.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Job;

/**
 * Servlet implementation class A12_AjaxControllerJob
 */
@WebServlet(name = "jobControll", urlPatterns = { "/jobControll" })
public class A12_AjaxControllerJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A12_AjaxControllerJob() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jid = request.getParameter("jid");
		if(jid == null) jid = "";
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		Gson g = new Gson();
		A04_PreparedDao dao = new A04_PreparedDao();
		
		Job j = dao.getJobs(jid);
		response.getWriter().print(g.toJson(j));
		
		// 이후에 List<Job> 출력까지 처리 
		
		
	}

}

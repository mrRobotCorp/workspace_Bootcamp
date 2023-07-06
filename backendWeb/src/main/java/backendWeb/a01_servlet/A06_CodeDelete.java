package backendWeb.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import backendWeb.a01_dao.A04_PreparedDao;

/**
 * Servlet implementation class A06_CodeDelete
 */
@WebServlet(name = "codeDel.do", urlPatterns = { "/codeDel.do" })
public class A06_CodeDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A06_CodeDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String noS = request.getParameter("no"); 
		int no = 0;
		if(noS!=null&&!noS.equals("")) 
			no = Integer.parseInt(noS);
		A04_PreparedDao dao = new A04_PreparedDao();
		dao.deleteCode(no);
		
		
		
	}

}

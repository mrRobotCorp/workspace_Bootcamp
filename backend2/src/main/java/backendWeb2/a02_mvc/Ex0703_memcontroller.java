package backendWeb2.a02_mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import backendWeb2.a01_dao.A05_MemberDao;

/**
 * Servlet implementation class Ex0703_memcontroller
 */
@WebServlet(name = "memList.do", urlPatterns = { "/memList.do" })
public class Ex0703_memcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex0703_memcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		A05_MemberDao dao = new A05_MemberDao();
		request.setAttribute("memList", dao.mlist());
		
		String page = "ex0703.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

}

package servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CardClass;
import model.Hand;
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ControllerServlet() {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get imformation type
		request.setCharacterEncoding("utf-8");
		// get instance
		ServletContext application = this.getServletContext();
		CardClass cc = new CardClass();
		Hand[] hd = cc.handCreate();
		//
		application.setAttribute("hand1", hd[0]);
		application.setAttribute("hand2", hd[1]);
		application.setAttribute("hand3", hd[2]);
		application.setAttribute("hand4", hd[3]);
		//
		RequestDispatcher rd = request.getRequestDispatcher("/match.jsp");
		rd.forward(request, response);
	}
}

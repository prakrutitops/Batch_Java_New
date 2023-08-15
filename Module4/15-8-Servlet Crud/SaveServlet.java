import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		
		Model m =new Model();
		m.setName(name);
		m.setSurname(surname);
		m.setEmail(email);
		
		int ans = Dao.savedata(m);
		
		if(ans>0)
		{
			//out.print("inserted");
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("fail");
		}
		
	
	}
}

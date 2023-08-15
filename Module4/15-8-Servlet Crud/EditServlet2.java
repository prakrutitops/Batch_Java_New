import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		
		int id2 = Integer.parseInt(id);
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		
		Model m =new Model();
		m.setId(id2);
		m.setName(name);
		m.setSurname(surname);
		m.setEmail(email);
		
		int data = Dao.updatedata(m);
		
		if(data>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("Error");
		}
		
		
		
	}
}

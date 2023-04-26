import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ManagerdeleteServlet")
public class ManagerdeleteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello from Delete Servlet");
        int mId = Integer.parseInt(req.getParameter("id"));
        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Manager manager = (Manager)session.get(Manager.class,mId);
        session.delete(manager);
        tx.commit();
        session.close();
        resp.sendRedirect("admin");
    }
}

import org.hibernate.Session;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/AllManager")
public class AllManager extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

            Session s = FactoryProvider.getSessionFactory().openSession();
            Query q = s.createQuery("from Manager");
            List<Manager> list = q.getResultList();
            req.setAttribute("listManager",list);
            req.getRequestDispatcher("AllManager.jsp").forward(req,resp);
            s.close();



    }
}

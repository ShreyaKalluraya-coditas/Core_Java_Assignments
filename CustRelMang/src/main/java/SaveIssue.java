import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SaveIssue")
public class SaveIssue extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("Hello from Servlet");
        resp.setContentType("Text/HTML");
        String eventDatetime = req.getParameter("event-datetime");
        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        HttpSession s = req.getSession();
        String email = (String) s.getAttribute("email");
        String hql = "from User where email =:email1 ";
        Query query = session.createQuery(hql);
        query.setParameter("email1", email);
        User user = (User) query.uniqueResult();


        String name = req.getParameter("name");
        String issue = req.getParameter("issue");
        String other = req.getParameter("other");

        Issue issues = new Issue(eventDatetime,issue,other,name);
        issues.setUser(user);
        session.save(issues);
        tx.commit();
        session.close();


    }
}

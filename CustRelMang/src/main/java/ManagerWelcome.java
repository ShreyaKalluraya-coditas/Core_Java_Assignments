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


@WebServlet("/ManagerWelcome")
public class ManagerWelcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello from Manager Welcome Servlet");
        resp.setContentType("Text/HTML");
        HttpSession se= req.getSession();
         String email = (String) se.getAttribute("email");
        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String hql = "from Manager where email =:email1";
        Query query = session.createQuery(hql);
        query.setParameter("email1", email);
        Manager manager = (Manager) query.uniqueResult();
        se.setAttribute("manager",manager);
        out.println("<a href='Register.jsp'>Add a User</a>");
        out.println("<a href='IssueOfUser?email="+email+"'>View The Issue of Your Registered User</a>");
        session.close();






    }
}

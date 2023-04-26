import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/IssueOfUser")
public class IssueOfUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello from Issue Servlet");
        resp.setContentType("text/html");
       String email = req.getParameter("email");
        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String hql = "from Manager where email =:email1 ";
        Query query = session.createQuery(hql);
        query.setParameter("email1", email);
       Manager manager = (Manager) query.uniqueResult();
       int id = manager.getId();
       out.println(id);
     //  String hqls ="FROM Issue i WHERE i.user IN (SELECT u FROM User u WHERE u.manager.id = id )";
        String hqls = "SELECT i FROM Issue i\n" +
                "INNER JOIN i.user u\n" +
                "INNER JOIN u.manager m\n" +
                "WHERE m.id = :id";
        System.out.println(hqls);
       Query querys = session.createQuery(hqls);
       querys.setParameter("id", id);
        System.out.println("Queries list:::"+querys.getResultList());
       List<Issue>issues = querys.list();
//        for (Issue i:issues) {
//            System.out.println(i.getId());
//            out.println(i.getId());
//        }
        out.println("<table border = 2px>");
        out.println("<tr><th>ID</th><th>User Name</th><th>Monthly Call Time</th><th>Isue</th><th>Name</th><th>Other</th></tr>");
            for (Issue issue : issues) {
                out.println("<tr><td>" + issue.getId() + "</td><td>" + issue.getUser().getName()+ "</td><td>" + issue.getEventDatetime()+ "</td><td>" + issue.getIssue() + "</td><td>"+issue.getName()+"</td><td>"+issue.getOther()+"</td></tr>");
            }
            out.println("</table>");





      //  Issue issues = (Issue) querys.uniqueResult();
     //   out.println(issues.getId());

//            out.println("<table>");
//            out.println("edhar bhi");
//            out.println("<tr><th>ID</th><th>User Name</th><th>Monthly Call Time</th><th>Isue</th><th>Name</th><th>Other</th></tr>");
//            for (Issue issue : issues) {
//                out.println("<tr><td>" + issue.getId() + "</td><td>" + issue.getUser().getName()+ "</td><td>" + issue.getEventDatetime()+ "</td></tr>" + issue.getIssue() + "</td></tr>"+issue.getName()+"</td></tr>"+issue.getOther());
//            }
//            out.println("</table>");


        tx.commit();
        session.close();



    }
}

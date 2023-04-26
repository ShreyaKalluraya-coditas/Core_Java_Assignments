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
import java.util.List;

@WebServlet("/UserWelcome")
public class UserWelcome extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        HttpSession s = req.getSession();
        String email = (String) s.getAttribute("email");
        out.println("Hello from User Servlet "+email);
        resp.setContentType("Text/HTML");
        out.println("</br>");
        out.println("</br>");
        out.println("</br>");

        out.println("Your Manager is :: ");
        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String hql = "from User where email =:email1 ";
        Query query = session.createQuery(hql);
        query.setParameter("email1", email);
        User user = (User) query.uniqueResult();
       Manager manager =  user.getManager();
       String mName = manager.getName();
       out.print(mName);
        out.println("</br>");
        out.println("</br>");
        out.println("</br>");


        out.println("Already Booked Slots of Your Manager are ::");
        int mid = manager.getId();
        System.out.println(mid);
       // String hqls = "from Issue i where i.user.manager.id = :mid select i.eventDatetime";
        String hqls = "select i.eventDatetime from Issue i where i.user.manager.id = :mid";
        Query querys = session.createQuery(hqls);
        querys.setParameter("mid", mid);
        List<String> eventDateTimes = querys.getResultList();

        out.println("<table>");
        out.println("<tr><th>Event Date Time</th></tr>");
        for (String eventDateTime : eventDateTimes) {
            if (eventDateTime != null) {
                out.println("<tr><td>" + eventDateTime + "</td></tr>");
            }
        }
        out.println("</table>");


        out.println("</br>");
        out.println("</br>");
        out.println("</br>");
        out.println("</br>");



       out.println("Book Your monthly slot for the Manager to contact you !!");
       out.println("</br>");
       out.println("</br>");
       out.println("</br>");
       out.println("<form action=\"SaveIssue\" method=\"get\">\n" +
                "    <label>Event date and time:</label>\n" +
                "    <input type=\"datetime-local\" name=\"event-datetime\">\n" +
                "     <input type=\"Submit\" value=\"Done\">\n" +
                "    </form>");

//        String eventDatetime = req.getParameter("event-datetime");

        out.println("</br>");
        out.println("</br>");
        out.println("</br>");
        out.println("</br>");

        out.println("<a href='Complaint.jsp?email="+email+"'>Raise a Complaint</a>");

//        String name = req.getParameter("name");
//        String emails = req.getParameter("email");
//        String issue = req.getParameter("issue");
//        String other = req.getParameter("other");
//


//        Issue issues = new Issue(eventDatetime,issue,other,name);
//        session.save(issues);
        tx.commit();
        session.close();
        resp.setContentType("Text/HTML");

        out.println("</br>");











    }
}

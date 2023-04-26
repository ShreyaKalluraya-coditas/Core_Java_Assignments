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

@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello from Servlet");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        HttpSession s = req.getSession();

        if(role.equalsIgnoreCase("Admin")){

                resp.sendRedirect("admin");

        }
       else if(role.equalsIgnoreCase("User")) {
            Session session = FactoryProvider.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            String hql = "from User where email =:email1 and  passwod =:password1";
            Query query = session.createQuery(hql);
            query.setParameter("email1", email);
            query.setParameter("password1", password);
            List<User> l = query.list();
            System.out.println(l.size());
            if (l.size() > 0) {
                s.setAttribute("email",email);
                resp.sendRedirect("UserWelcome");
            } else {
                System.out.println("Invalid Credentials");
                resp.sendRedirect("Login.jsp");
            }
            tx.commit();
            session.close();

        }
       else if(role.equalsIgnoreCase("Manager")){

            Session session = FactoryProvider.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            String hql = "from Manager where email =:email1 and  passwod =:password1";
            Query query = session.createQuery(hql);
            query.setParameter("email1", email);
            query.setParameter("password1", password);
            List<User> l = query.list();
            System.out.println(l.size());
            if (l.size() > 0) {
                s.setAttribute("email",email);
                resp.sendRedirect("ManagerWelcome");
            } else {
                resp.sendRedirect("Login.jsp");
            }
            tx.commit();
            session.close();




        }

    }
}

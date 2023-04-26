import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Savemanager")
public class Savemanager extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String password = req.getParameter("password");


        Manager manager = new Manager(name, email, phone, address, password);

        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
       // session.save(manager);
        tx.commit();
        session.close();
        resp.setContentType("Text/HTML");
        PrintWriter out = resp.getWriter();
        out.println("Manager is Registered Succesfully !! ");
        out.println("</br>");
        HttpSession se = req.getSession();
        se.setAttribute("manager", manager);

        out.println("<a href='Register.jsp'>Add a User</a>");
        out.println("<a href='Login.jsp'>Login</a>");

    }
}

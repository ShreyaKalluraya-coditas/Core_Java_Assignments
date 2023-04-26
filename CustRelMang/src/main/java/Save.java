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

@WebServlet("/Save")
public class Save extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String password = req.getParameter("password");
        HttpSession se = req.getSession();



        User user = new User(name, email, phone, address, password);

        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();



        Manager manager = (Manager) se.getAttribute("manager");
        manager.getUser().add(user);
        user.setManager(manager);
        session.saveOrUpdate(manager);


     //   session.save(user);
        tx.commit();
        session.close();
        resp.setContentType("Text/HTML");
        PrintWriter out = resp.getWriter();
        out.println("You are Registered Succesfully !! ");
        out.println("</br>");
        out.println("<a href='Login.jsp'>Login</a>");


    }



    }


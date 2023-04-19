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

@WebServlet("/UserPage")
public class UserPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();




        //out.println("Hello from Servlet");
        resp.setContentType("Text/HTML");
        out.println("user page ");
        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        HttpSession se = req.getSession();
        String email = (String) se.getAttribute("email");
        //List<Customer> customer;
        Query query = session.createQuery("from Customer where email =: email");
        query.setParameter("email",email);
        //customer = query.getResultList();
        Customer customer = (Customer) query.uniqueResult();



        int customerId = customer.getId();
        se.setAttribute("customer",customer);



        Query q = session.createQuery("from Product p where p.customer.id = :customerId");
        q.setParameter("customerId", customerId);
        List<Product> productList = q.getResultList();
        for (Product product : productList) {
            int proId = product.getId();
            out.println("Product ID: " + product.getId());
            out.println("</br>");
            out.println("Product Name: " + product.getName());
            out.println("</br>");
            out.println("Product Quantity Avaliable: " +product.getQty());
            out.println("</br>");
            out.println("Product Price: " +product.getPrice());
            out.println("</br>");
            se.setAttribute("proId",proId);

           out.println("<form action ='updateProduct' method ='get'>\n" +
                   "                   Enter the quantity you want\n" +
                   "                   <input type='text'name='addedqty'>\n" +
                   "                   <input type='Submit' value='Add'>\n" +
                   "                   </form>");
        }





        int id = customer.getId();

        out.println("<a href ='Bill'>Generate Bill</a>");
        out.println("<a href='updateServlet?id="+id+"'>Update </a>");
        out.println("<a href='deleteServlet?id="+id+"'>Delete</a>");













    }
}

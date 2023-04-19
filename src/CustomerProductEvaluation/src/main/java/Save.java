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
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Save")
public class Save extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String password = req.getParameter("password");

        Customer customer = new Customer(name,address,email,phone,password);


        Product product = new Product("Sample Product", "1000", "10",0);
        product.setCustomer(customer);

        // Add the product to the customer's list of products
        List<Product> products = new ArrayList<>();
        products.add(product);
        customer.setProduct(products);

        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(customer);
        tx.commit();
        HttpSession se = req.getSession();
        se.setAttribute("customer", customer);
        session.close();






        out.println("<a href='index.jsp'>Login</a>");



    }
}

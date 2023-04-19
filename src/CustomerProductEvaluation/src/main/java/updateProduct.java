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

@WebServlet("/updateProduct")
public class updateProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();


        Session session = FactoryProvider.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();


           HttpSession se = req.getSession();
        Customer customer = (Customer) se.getAttribute("customer");
        int customerId = customer.getId();
        Query q = session.createQuery("from Product p where p.customer.id = :customerId");
        q.setParameter("customerId", customerId);
        List<Product> productList = q.getResultList();
        int qty = Integer.parseInt(req.getParameter("addedqty"));
        for (Product product : productList) {
            int pqty = Integer.parseInt(product.getQty());
            if(pqty<qty){
                out.println("You cannot add this much product as it is not available");
            }
            else {
                product.setAddedqty(qty);
                pqty = pqty-qty;
                product.setQty(String.valueOf(pqty));

                tx.commit();
                resp.sendRedirect("UserPage");
            }
        }




    }
}

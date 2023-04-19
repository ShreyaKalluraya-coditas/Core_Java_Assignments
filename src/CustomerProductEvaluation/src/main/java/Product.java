import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String price;
    private String qty;

    private int addedqty;

   @ManyToOne
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAddedqty() {
        return addedqty;
    }

    public void setAddedqty(int addedqty) {
        this.addedqty = addedqty;
    }

    public Product(String name, String price, String qty, Customer customer) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.customer = customer;
    }

    public Product(String name, String price, String qty, int addedqty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.addedqty = addedqty;
    }

    public Product(){

    }

}

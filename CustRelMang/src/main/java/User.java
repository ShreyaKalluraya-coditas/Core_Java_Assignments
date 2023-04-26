import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String passwod;

    @ManyToOne
    private Manager manager;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Issue> issue;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPasswod() {
        return passwod;
    }

    public void setPasswod(String passwod) {
        this.passwod = passwod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Issue> getIssue() {
        return issue;
    }

    public void setIssue(List<Issue> issue) {
        this.issue = issue;
    }

    public User(String name, String email, String phone, String address, String passwod) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.passwod = passwod;
    }
    public User(){

    }

    public User(String name, String email, String phone, String address, String passwod, Manager manager) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.passwod = passwod;
        this.manager = manager;
    }
}

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Names {
   private String department;
   private String name;
   private String phone;
   private String Address;

    public Names() {  
        
    }
    
    public Names(String department, String name, String phone, String Address) {
        this.department = department;
        this.name = name;
        this.phone = phone;
        this.Address = Address;
        System.out.println(this.department);
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }  
    
   
}

package controll;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.ProductFacade;
import entities.*;

@Named(value = "productcontroll")
@SessionScoped
public class Productcontroll implements Serializable {

    @EJB
    private ProductFacade productFacade;
    private Product product=new Product();
    
    
    public Productcontroll() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    //read
    public List<Product> findAll()
    {
        return this.productFacade.findAll();
    }
    //create
    public String insert(){
        this.productFacade.create(product);
        this.product=new Product();
        return "index";
    }
    //delete
    public String delete(Product product){
        this.productFacade.remove(product);
        return "index";
    }
    //Edit
     public String update(Product product){
        this.product=product;
        return "update";
    }
      public String update(){
        this.productFacade.edit(product);
        return "index";
    }
}
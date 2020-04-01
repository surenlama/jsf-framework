import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class Usercontroller {
private String name;
private List<Names> l;
private Map<String,String> course;
private Map<String,String> subject;
private Names man;    
    


    public Usercontroller() {
        
      l =new ArrayList<>();
      
      man=new Names("", "","","");
  
    }
    
@PostConstruct
public void init(){
        
course=new LinkedHashMap<String,String>();
subject=new LinkedHashMap<String,String>();
        

course.put("Nursing","Nursing");
course.put("IT","IT");   
course.put("commerce","commerce");
course.put("Arts","Arts");   
    }
    
    public void valueChange(ValueChangeEvent e){

    System.out.println("Old value"+e.getOldValue());
    System.out.println("New value:"+e.getNewValue());
    
    if("Nursing".equals(e.getNewValue())){
        subject.clear();
        subject.put("chemistry","chemistry");
        subject.put("microbiology","microbiology");
        subject.put("Community Health ","Community Health");       
    }
      
    else if("IT".equals(e.getNewValue())){
        subject.clear();
        subject.put("Java","Java");
        subject.put("C","C");
        subject.put("Python","Python");       
    }
    
     else if("commerce".equals(e.getNewValue())){
        subject.clear();
        subject.put("Accountancy","Accountancy");
        subject.put("Business Studies","Business Studies");
        subject.put("Economics","Economics");       
    }
     
    else if("Arts".equals(e.getNewValue())){
        subject.clear();
        subject.put("philosophy","philosophy");
        subject.put("religion","religion");
        subject.put("communication","communication");       
    }
   }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Names> getL() {
        return l;
    }

    public void setL(List<Names> l) {
        this.l = l;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Map<String, String> getSubject() {
        return subject;
    }

    public void setSubject(Map<String, String> subject) {
        this.subject = subject;
    }

    public Names getMan() {
        return man;
    }

    public void setMan(Names man) {
        this.man = man;
    }
   

public void update(){
    man=new Names("","","","");
    
}
public void delete(){
    l.remove(man);
    man=new Names("","","","");
}
      
public void insert(){
    l.add(man);
    man=new Names("","","","");
}
  

}
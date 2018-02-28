package student;

public class CollegeCourse {
    private String id;
    private Integer creditos;
    private String calif;
    
    public CollegeCourse(String id, Integer creditos, String calif){
        this.id=id;
        this.creditos=creditos;
        this.calif=calif;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public void setCreditos(Integer creditos){
        this.creditos=creditos;
    }
    
    public void setCalif(String calif){
        this.calif=calif;
    }
    
    public String getId(){
        return this.id;
    }
    
    public Integer getCreditos(){
        return this.creditos;
    }
    
    public String getCalif(){
        return this.calif;
    }
}
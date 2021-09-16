package OOps;
class Employee2{
    private int id;
    private String name;
   public Employee2()  // constructor
    {
        id=45;
        name="your-name";
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class Acces {
    public static void main(String[] args){

        Employee2 s=new Employee2();
        //s.setId(6);
      // s.setName("Pratim");
        System.out.println(s.getName());
       System.out.println(s.getId());

    }
    
}

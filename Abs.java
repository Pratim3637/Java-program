package OOPs;
/*abstract class Parent2{
    public Parent2(){
        System.out.println("Mai parenet class ka constructor hu");
    }
    public void sayhello() {
        System.out.println("Helllo");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println(" i am Greet");
    }
    
    public void greet2(){
        System.out.println("I am greet2");
    }

}
abstract class Child3 extends Parent2{
    public void greet3(){
        System.out.println("I am greet3");
    }
}

public class Abs {
    public static void main(String[] args){
        Child2 c=new Child2();
        c.greet();
        c.greet2();
    }
}  */
// Interface........................................................................
/*interface Bycycle {
    void speedup();
    void breakup();
    public int a=36;
}
interface Bycycle2 {
    void yelo();
    void hado();
}
class Avon implements Bycycle,Bycycle2{
    //int a=37;
    void ride(){
        System.out.println("I am riding a bycycle");
    }

    public void speedup(){
        System.out.println("Please down the speed");
    }
    public void breakup(){
        System.out.println(" please stop the cycle");
    }
    public void yelo(){
        System.out.println("kya");
    }
    public void hado(){
        System.out.println("woow ");
    }
}
public class Abs{
     public static void main(String[] args){
         Avon cy=new Avon();
         cy.speedup();
         cy.hado();
         cy.breakup();
         cy.ride();
         cy.yelo();
         System.out.println(cy.a);
     }
}  */
// Inheritance and interfaces................................................................
/*interface Call{
    void ring();
    void dail();
    /*private void wish(){
        System.out.println("Good Moring!..");
    } 
    default void wrongnumber(){
        System.out.println("During Calling Time This Number Is Wrong...");
    }
}
interface Wifi{
    String [] connectNetwork();
    void network();
}
class Phone{
    void camra(){
        System.out.println("What a Camra !");
    }
    void battry(){
        System.out.println("How much time durating of battry !");
    }
}
class SmartPhone extends Phone implements Call,Wifi{
    void features(){
        System.out.println("Woow this <obile has different features available");
    }
    public void ring(){
        System.out.println("Call is Ringing....");
    }
    public void dail(){
        System.out.println("Call is Dailing..");
    }
    public String[] connectNetwork(){
        System.out.println("Connecting to device to Wifi...");
        String[] list={"Rockdada","Iphone6","iPhone5"};
        return list;
    }  
    public void network(){
        System.out.println("Network is available..");
    } 
 }
 public class Abs{
     public static void main(String[] args){
         SmartPhone sp=new SmartPhone();
         String[] arr=sp.connectNetwork();
         //sp.wish();   Produce Error...
         sp.battry();
         sp.camra();
         sp.features();
         sp.ring();
         sp.dail();
         for(String i:arr){
             System.out.println(i);
         }
         sp.wrongnumber();
     }
 }  */
 // interface inheritance...
 interface myphone{
     void call1();
     void call2();
 }
 interface myphone2 extends myphone{
     void call3();
     void call4();
 }
 class Smartphone implements myphone2{
     void dev(){
         System.out.println("Devo ke Dev MahaDev..!");
     }
     public void call1(){
         System.out.println("Calling One times...");
     }
     public void call2(){
         System.out.println("Calling 2nd times..");
     }
     public void call3(){
         System.out.println("calling 3rd times...");
     }
     public void call4(){
         System.out.println("Callling 4th times....");
     }
 }
 public class Abs{
     public static void main(String[] args){
         Smartphone sm=new Smartphone();
         sm.dev();
         sm.call1();
         sm.call2();
         sm.call3();
         sm.call4();         
     }
 }





/*class Hii extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hiii");
            try{

                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }

        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{

                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }

        }
    }
}

public class Adv {

    public static void main(String[] args) {
    Hii obj1=new Hii();
    Hello obj2=new Hello();
    obj1.start();
    try{

        Thread.sleep(10);
    }catch(Exception e){
        System.out.println(e);
    }
    obj2.start();
    
}
}  

//...Thread Runnable...
class Hii implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hiii");
            try{

                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }

        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{

                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }

        }
    }
}

public class Adv {

    public static void main(String[] args) {
    Runnable obj1=new Hii();
    Runnable obj2=new Hello();
    Thread t1=new Thread(obj1);
    Thread t2=new Thread(obj2);
    t1.start();
    // try{

    //     Thread.sleep(10);
    // }catch(Exception e){
    //     System.out.println(e);
    // }
    t2.start();
    
}
} 

//....join................................
public class Adv {

    public static void main(String[] args) throws Exception 
    {
    
    Thread t1=new Thread(()->
    {
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{

                Thread.sleep(1000);
            }catch(Exception e){
            }
        }

    });
    Thread t2=new Thread(()->{
        for(int i=1;i<=5;i++){
            System.out.println("Hii");
            try{

                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }  );
    t1.start();
    try{

        Thread.sleep(10);
    }catch(Exception e){
        System.out.println(e);
    }
    t2.start();
    System.out.println("Ha Yar..");
    t1.join();
    t2.join();
    System.out.println(t1.isAlive());
    System.out.println("Bye");
    
}
}  */
//ArrayList... array
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class Adv{
    public static void main(String[] args) {
//         //ArrayList<String> t1 = new ArrayList<String>();
//         int a[]=new int[4];
//         Object Values[]=new Object[4];
//         //Collection values=new ArrayList();
//         values[0]="Pratim";
//         values[1]=37;
//         values[2]=4.6f;

//     //    for(String i:t1){
//     //        System.out.println(i);
//     //    }
//     Iterator i = values.iterator();
//     System.out.println(i.next());
//     System.out.println(i.next());
//     System.out.println(i.next());
//     }
// }
// Set<Integer> values = new HashSet<Integer>();
// values.add(8);
// values.add(37);
// values.add(7);
// for(int i:values){
//     System.out.println(i);
// }
//     }
// }
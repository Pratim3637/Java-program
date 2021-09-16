
class C1{
    public int a=5;
    protected int x=70;
     int y=20;
     private int z=4;
     public void meth1(){
         System.out.println(x);
         System.out.println(y);
         System.out.println(z);
         System.out.println(a);
     }
}
public class Access {
    public static void main(String[] args) {
        C1 c=new C1();
       // c.meth1();
       System.out.println(c.x);
         System.out.println(c.y);
        // System.out.println(c.z);
         System.out.println(c.a);

    }

}

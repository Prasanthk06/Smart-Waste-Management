class A 
{
    public void display()
    {
        int a=10,b=20;
        System.out.println(a+b);
    
    }
}

public class B extends A 
{
   public void display2(){System.out.println("Second class");}
   public static void main(String[] args) {
       B b=new B();
       b.display();
       b.display2();
   }
}
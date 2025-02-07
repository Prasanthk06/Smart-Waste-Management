import java.util.*;
public class first
{
    int rec(int x)
    {
    if(x!=0)
    return x;
    else
    return x*rec(x-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,m;
        
        System.out.println("Enter two numbers");
         n=sc.nextInt();
         m=sc.nextInt();
        if((n+m)%2==0)
          System.out.println("Even");
        else
          System.out.println("Odd");
    first obj=new first();

    System.out.println("The Factorial of 5= " + obj.rec(5));
}
}
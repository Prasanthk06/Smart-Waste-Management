import java.util.*;
public class pallinstr
{
    public static void main(String[] args) {

     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String n=sc.next();
     StringBuilder a= new StringBuilder(n);
     a.reverse();
     String c = a.toString();
     if(c.equals(n))
     {
        System.out.println("It is a pallindrome String");
     }

     else
     {
        System.out.println("It is not a Pallindrome string");
     }



        
    }
}
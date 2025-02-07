import java.util.*;
public class operator
{
    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the arthemtic operation u want to do");
     System.out.println("1.Addition");
     System.out.println("2.Subtraction");
     System.out.println("3.Multiplication");
     System.out.println("4.Divison");

     int n;
     n=sc.nextInt();

     
     System.out.println("Enter two numbers");
     double a=sc.nextDouble();
     double b=sc.nextDouble();

     switch(n)
     {
        case 1:
        {
           System.out.println("Sum of two numbers"+ (a+b));
           break;
        }

        case 2:
        {
           System.out.println("Subtraction of two numbers"+ (a-b));
            break;
        }

         case 3:
        {
           System.out.println("Multiplication of two numbers"+ (a*b));
           break;
        }
        

        case 4:
        {
           System.out.println("Division of two numbers"+(a/b));
           break;
        }

        default:
        {
            System.out.println("Enter Correct Value");
        }



     }
    


        
    }
}
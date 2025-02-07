
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int M;
        System.out.println("Good Number Checking System");
        System.out.println("Enter The Number To checked");
        M=sc.nextInt();
        if(M%3==0 && M%5==0)
        {
            System.out.println("Good Number");
        }

        else if(M%3==0)
        {
            System.out.println("Bad Number");

        }

        else if(M%5==0)
        {
            System.out.println("Poor Guy");
        }

        else
        {
            System.out.println("-1");
        }

    }
}
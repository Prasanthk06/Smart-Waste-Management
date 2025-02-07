import java.util.Scanner;
public class c1 {
    public static void main(String[] args) {
       System.out.println("Marking System");
       Scanner sc= new Scanner(System.in);
       int Roll;
       String name;
       float Mark1,Mark2,Mark3,Mark4,Mark5;
       System.out.println("Enter the Roll Number");
       Roll=sc.nextInt();
       System.out.println("Enter the name of the student");
       name=sc.next();
       System.out.println("Enter the marks of five subjects");
       Mark1=sc.nextFloat();
       Mark2=sc.nextFloat();
       Mark3=sc.nextFloat();
       Mark4=sc.nextFloat();
       Mark5=sc.nextFloat();
       float total=Mark1+Mark2+Mark3+Mark4+Mark5;
       System.out.println("Total Marks of the student is "+total);
       float MaxMarks=500;
       float percentage=total/MaxMarks*100;
       if(percentage>=90.00)
       {
         System.out.println("Grade A");
       }
       else if(percentage>=80.00)
       {
         System.out.println("Grade B");
       }

       else if(percentage>=70.00)
       {
         System.out.println("Grade C");
       }

       else
       {
        System.out.println("Failed in Every in subject");
       }
       
    }
}
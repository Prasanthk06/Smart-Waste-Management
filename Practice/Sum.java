public class Sum 
{
    public static void main(String[] args) 
{
        

	//Parse the arguments as numbers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate the sum
            int sum = num1 + num2;

            // Display the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
            
}
}
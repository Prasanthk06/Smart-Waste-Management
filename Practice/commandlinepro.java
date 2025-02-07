public class commandlinepro 
{
    public static void main(String args[]) 
	{
       
        System.out.println("You passed the following arguments:");
        for (String i : args) 
	    {
            System.out.println(i);
        }

    }
}
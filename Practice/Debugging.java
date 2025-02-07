public  class Debugging
{
    public static void main(String[] args) {

        //Problem: Calculate the Area of a Circle 
        //double radius = 7; double area = 3.14 * radius ^ 2;
        //System.out.println(&quot;The area of the circle is: &quot; + area);
        
        //ANSWER1:

        double radius = 7; 
        double area = 3.14 * radius * 2;
        System.out.println(";The area of the circle is:" + area);


        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:"+ a +b );


        int i;
        for ( i = 1; i<= 10; i++);
            {
                System.out.println("Answer"+i);
            }   


        int n = 5;
        int fact = 1;
        for (fact = 1; fact<= n; fact++)
                {
                        fact = fact * i;
                }


        int m = 1;
        while (m <= 5)
            {
                System.out.println("Count:"+ m);
                m++;
            }
    }
}
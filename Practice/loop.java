public class loop{
     public static void main(String[ ] args){
        for(int i=0; i<=10; ++i){ //printing positive numbers less than 10 using for loop
              System.out.print(i+"  ");
        }
         int j=0;
         System.out.println();
         System.out.println("Using while loop : ");
         while(j<=10){ //printing positive numbers less than 10 using while loop 
         System.out.print(j+"  ");
         ++j;
           }
         System.out.println();
         int x=0;
         System.out.println("Using while loop printing even numbers less than 10 : ");
         while(x<=10){ //printing even positive numbers less than 10 using while loop
         if(x%2==0){
         System.out.print(x+"  ");  
         } 
         ++x;
        }
System.out.println();
int z=0;
System.out.println("Using do while loop printing numbers less than 10 : ");
do{ //printing positive numbers less than 10 using do while loop
System.out.print(z+"  ");
++z;
} while(z<=10);
System.out.println();
for(;;){
System.out.println("Hi");
}
}
}
import classes.SmartWasteBin;
import classes.recyclebin;
import java.util.*;
public final class Waste
{
    public static int getValidInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input.\nPlease enter a valid integer.");
            sc.next();
        }
        return sc.nextInt();
    }

    public static String getvalidstring(Scanner sc)
    {
        while(!sc.hasNext())
        {
            System.out.println("Invalid input.\nPlease enter a valid String ");
            sc.next();
        }
        return sc.next();
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of bins");
        int numbins = sc.nextInt();
        SmartWasteBin[] bin = new SmartWasteBin[numbins];
        for(int i =0; i<numbins;i++)
        {
            System.out.println("Enter the binid");
            int binid= getValidInt(sc);
            sc.nextLine();
            System.out.println("Enter the Location");
            String location= sc.nextLine().trim().toUpperCase();
            System.out.println("Is the Bin recycle");
            String r = sc.nextLine().trim().toLowerCase();
            String y="yes";
            if(r.equals(y))
            {
                System.out.println("Enter the Type");
                String cv = sc.nextLine();
                System.out.println("Enter the Capacity");
                int  hg = sc.nextInt();
                bin[i] = new recyclebin(binid, location, hg, cv);
            }
            else
            {
            System.out.println("Do you specify the Capacity");
            String c = sc.nextLine();
            if(c.equalsIgnoreCase("yes"))
            {
                System.out.println("Enter the capacity");
                int cap= sc.nextInt();
                bin[i]=new SmartWasteBin(binid,location,cap);
            }
            else
            {
                bin[i]= new SmartWasteBin(binid, location, 100);
            }
            }
            
        }
    int choice;
    {
        do
        {
            StringBuffer log = new StringBuffer();
            log.append("Waste Management System\n");
            log.append("1.Add Waste(int liters)\n");
            log.append("2.Add Waste(double liters)\n");
            log.append("3.EmptyBin\n");
            log.append("4.Display Details\n");
            log.append("5.Exit\n");
            log.append("Enter Your Choice");
            System.out.println(log.toString());
            choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    {
                         System.out.println("Enter the Binind");
                         int b =sc.nextInt();
                         boolean found = false;
                         for(int i=0;i<bin.length;i++)
                         {
                            if(bin[i].binid==b)
                            {
                                System.out.println("Enter the Amount to be added(int)");
                                int a =sc.nextInt();
                                bin[i].addwaste(a);
                                found = true;
                            }
                         }

                         if(!found)
                         {
                            System.err.println("No such Bins found with that Bin id");
                         }

                    }
                    break;
                case 2:
                    {
                         System.out.println("Enter the Binind");
                         int b =sc.nextInt();
                         boolean found = false;
                         for(int i=0;i<bin.length;i++)
                         {
                            if(bin[i].binid==b)
                            {
                                System.out.println("Enter the Amount to be added(double)");
                                double a =sc.nextDouble();
                                bin[i].addwaste(a);
                                found = true;
                            }
                         }

                         if(!found)
                         {
                            System.err.println("No such Bins found with that Bin id");
                         } 

                    }
                    break;
                case 3:
                    {
                        System.out.println("Enter the Binind");
                        int b =sc.nextInt();
                        boolean found = false;
                         for(int i=0;i<bin.length;i++)
                         {
                            if(bin[i].binid==b)
                            {
                                bin[i].emptybin();
                                found = true;
                            }
                         }
                        if(!found)
                         {
                            System.err.println("No such Bins found with that Bin id");
                         } 
                    }
                    break;
                case 4:
                    {
                        System.out.println("Enter the Binind");
                        int b =sc.nextInt();
                        boolean found = false;
                         for(int i=0;i<bin.length;i++)
                         {
                            if(bin[i].binid==b)
                            {
                                bin[i].display();
                                found = true;
                            }
                         }
                        if(!found)
                         {
                            System.err.println("No such Bins found with that Bin id");
                         } 
                    }
                    break;
                case 5:
                    {
                    System.out.println("Exitingggg....");
                    break;
                    }
                default:
                    System.err.println("Enter the valid choice");
            }
            
            }while(choice!=5);
    }

 }
}
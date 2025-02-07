package classes;

import inter.interfacee;

public class SmartWasteBin implements interfacee
{
    private int capacity;
    private  int currentlevel;
    private  String location;
    public  int binid;

    public SmartWasteBin(int binid, String location, int capacity)
    {
        this.binid=binid;
        this.location=location;
        this.capacity=capacity;
        this.currentlevel=0;
        
    }

    public void addwaste(int amount)
    {
        if(currentlevel+amount<=capacity)
        {
            currentlevel+=amount;
            System.out.println("Waste Successfully added");
        }

        else
        {
            System.out.println("Capacity is full cannot be added");
        }
    }

    public void addwaste(double amount)
    {
        if(currentlevel+amount<=capacity)
        {
            int c= (int)amount;
            currentlevel+=c;
            System.out.println("Waste Successfully added");
        }

        else
        {
            System.out.println("Capacity is full cannot be added");
        }
    }
    public final void emptybin()
    {
        currentlevel=0;
        System.out.println("Bin cleaned fully");
    } 

    public void display()
    {
        System.out.println("Bin Details");
        System.out.println("Bin ID" + binid);
        System.out.println("Current level"+ currentlevel);
        System.out.println("Location"+ location.toUpperCase());
        System.out.println("Capacity" + capacity);
    }


}

abstract class Tools
{
    abstract void recyclewaste();
    abstract void dumpwaste();
}
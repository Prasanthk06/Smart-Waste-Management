class multi implements Runnable
{
    public void run()
    {
        int n = 2;
        for (int i=0;i<10;i++) {
            System.out.println("Table of Two:"+n*i);
        }
    }
}

class add implements Runnable
{
    public void run()
    {
        int n = 2;
        for(int i=0;i<=10;i++)
        {
            System.out.println("Addition of two"+(n+i));
        }
    } 
}

class cbbb
{
    public static void main(String[] args)
    {
        multi ob = new multi();
        Thread obj = new Thread(ob);
        obj.start();
        add b1 = new add();
        Thread obj1 = new Thread(b1);
        obj1.start();
    }
}
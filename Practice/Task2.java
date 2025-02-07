class Task2
{
    static int personid=10;
    String Personname;

    public Task2() {

        System.out.println("This is Default Constructor");
    }

    static 
    {
        System.out.println("******Student Registration form******");
    }

    

    Task2(String p)
    {
        this();
        this.Personname=p;
    }

    public static  void add(Task2 obj)
    {
        System.out.println(obj.personid);
        System.out.println(obj.Personname);
    }

    public static void main(String[] args) {
        Task2 m =new  Task2("SIMON");
        Task2 m1 =new  Task2("Prasanth");

        m.add(m1);
        add(m);
    }
}
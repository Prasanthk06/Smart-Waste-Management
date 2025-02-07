class xlass1
{
    int rollno;
    String name;

    void gect(int r,String n)
    {
        rollno=r;
        name=n;
    }

    void show()
    {
        System.out.println(rollno+" "+name);

    }

    public static void main(String[] args) {
        xlass1 c = new xlass1();
        c.gect(10,"Rakshan");
        c.show();

    }
}

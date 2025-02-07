public class Arrary1
{
    public static void main(String[] args) {
       // int a[]={33,44,45};

        //for (int i = 0; i < a.length; i++) {

          //  System.out.println(a[i]);
            
        //}

        int b[][]={{1,3,4},{3,4,5}};
        int c[][]={{1,3,4},{3,4,5}};

        int d[][]=new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                d[i][j]=b[i][j]+c[i][j];
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
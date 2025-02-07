import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array 1: " + Arrays.toString(arr));

        
        int[] nums = {10, 20, 30, 40};
        System.out.println("Array 2: " + nums[3]); 

        
        int[] source = {1, 2, 3, 4, 5};
        int[] target = Arrays.copyOf(source, source.length); 
        System.out.println("Source Array: " + Arrays.toString(source)); 
        System.out.println("Target Array: " + Arrays.toString(target)); 

        
        int[][] matrix = new int[2][2];
        matrix[1][1] = 5; 
        System.out.println("Matrix[1][1]: " + matrix[1][1]);

        
        MyClass obj1 = new MyClass();
        obj1.display();

        
        MyClassWithConstructor obj2 = new MyClassWithConstructor(10);

        
        MyClassWithShadowing obj3 = new MyClassWithShadowing(10);
        obj3.display();

      
        MyClassWithStatic.display();
    }
}

class MyClass {
    public void display() {
        System.out.println("Hello"); 
          }
}


class MyClassWithConstructor {
    MyClassWithConstructor(int value) {
        System.out.println("Constructor Value: " + value);
    }
}


class MyClassWithShadowing {
    int a;
    MyClassWithShadowing(int a) {
        this.a = a;
    }
    void display() {
        System.out.println("Shadowing Fixed Value: " + a);
    }
}


class MyClassWithStatic {
    int a = 10;
    static void display() {
        MyClassWithStatic obj = new MyClassWithStatic(); 
        System.out.println("Static Context Value: " + obj.a);
    }
}

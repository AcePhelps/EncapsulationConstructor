package lesson13;

public class App1 {
    public static void main(String[] args) {
        // primitive types
        int a = 5;
        int b = a;
        a=10;

        System.out.println("b = " +b);

        // reference type
        Person x = new Person("Anna");
        Person z = x;
        x.setName("David");
        System.out.println("z = "+z.getName());
        System.out.println(x.getName());



        int[]arr = {1,2};
        int[]arr1 = arr;
        arr1[0] = 10;
        System.out.println(arr1[0]);
    }
}

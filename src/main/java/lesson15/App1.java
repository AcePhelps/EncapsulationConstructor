package lesson15;

public class App1 {
    public static void main(String[] args) {
        int[]arr ={1,2,2};
        //arr[5] = 10;
       int x=5;
       int y=1;
        System.out.println("Before Try / catch block");
        try{
            System.out.println("In the try block before problem");
            int a = x/y;
            arr[2]=9;
            System.out.println("in the try block after problem");
        }catch (ArithmeticException err){
            System.out.println("Dont devide by zero");


    }catch (ArrayIndexOutOfBoundsException err){
            System.out.println("In the second catch block ");
        }finally {
            System.out.println("Will run in any case");
        }
        System.out.println("After try catch block  --  we did it ");
}}

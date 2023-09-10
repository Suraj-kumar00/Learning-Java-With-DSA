import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num2 = input.nextFloat(); // it is right and it'll not give any type of error
//        int num1 = input.nextFloat(); // it'll automatically gives error while you write nextFloat(), left side datatype should be greater then right side

        // here is the example of explicit type casting

//        int num1 = (int)(67.87f);
//        System.out.println(num1); // it should give 67 only because we are forcefully type casting the float value into integer


        // another is automatic type promotion in expression
//        int a =257;
//        byte b = (byte) (a);
//        System.out.println(b); // here this happening: 257 % 256 = 1

//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
//        int  d = a * b/ c; // here what is happening is that java automatically converting every datatype that you have provide here int large one which int here.
//        System.out.println(d);


        // some more examples

        // java follows unicode principles that means all the character and languages you print but i need to know more about it by googling a little bit

        int number = 'a'; // this will give the ASCII value of every character that you put here
        System.out.println(number);
        System.out.println("Annyeonghaseyo - hello ");

        // here is the example tha covers above very clearly:

        byte b = 23;
        char c = 'a';
        short s = 1234;
        int i = 40000;
        float f = 3.433f;
        double d = 3.1234;
        double result = (f*b) + (i/c) - (d*s);

        // float + int - double = double ; => as we in type casting the result will be in bigger datatype

        System.out.println((f*b) + " " + (i/c) + " " + (d*s)); // this will provide individual result
        System.out.println(result);


    }
}

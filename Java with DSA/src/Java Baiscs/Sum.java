import java.util.Scanner;



// this is a basic program of Sum of two numbers in which we are trying to give int and float values and determining the errors
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int Sum = num1 + num2;
        System.out.println(Sum);

    }
}


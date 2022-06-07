package avarageGrade;

import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {

        int a = 123;
        int sd = 23;

        sd *= a;
        System.out.println(sd);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int scanner1 = scanner.nextInt();
        System.out.println("Your age is " + scanner1);
        scanner.close();

        int number1 = 5;
        int number2 = 4;
        int number3 = 12;
        boolean condition1 = number1 == number2;
        boolean condition2 = number1 >= number3;
        boolean totalCondition = condition1 || condition2;

        String str = (totalCondition) ? "true" : "false";
        System.out.println(str);
    }
}

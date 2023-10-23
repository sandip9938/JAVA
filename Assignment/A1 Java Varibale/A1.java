import java.util.Scanner;

/**
 * A1
 */
public class A1 {

    public static void main(String[] args) {
        // Q1 - Take 2 integer values in two variables x and y and print their product.
        int x = 5;
        int y = 3;
        System.out.println("The product of " + x + " and " + y + " is: " + (x * y));
        // Q2 - Print the ASCII value of character ‘U’.
        char c = 'U';
        System.out.println("ASCII Value of U : " + ((int) c));
        // Q3 - Write a Java program to take the length and breadth of a rectangle and
        // print its area.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();
        System.out.println("Area of Rectangle is: " + (l * b));
        // Q4 - Write a Java program to calculate the cube of a number.
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Cube of Number is: " + (n * n * n));
        // Q5 - Write a Java program to swap two numbers with the help of a third
        // variable.
        int num1 = 8, num2 = 7;
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(temp);
        System.out.println("The first number after swap is :" + num1);
        System.out.println("The second number after swap is : " + num2);
        // Q5.a - Write a Java program to swap two numbers two variable.
        int num3 = 6, num4 = 9;
        num3 = num3 + num4;
        num4 = num3 - num4;
        num3 = num3 - num4;
        System.out.println("After swapping");
        System.out.println("First number:" + num3);
        System.out.println("Second number" + num4);

    }
}
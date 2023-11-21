package Scalar;

/**
 * Class3
 */
public class Class3 {

    public static void main(String[] args) {
        // loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Looping " + i);
        }
        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("While Looping " + j);
            j++;
        }
        // do-while loop
        int k = 0;
        do {
            System.out.println("Do While Looping " + k);
            k++;
        } while (k <= 4);
        // switch case statement
        String name = "John";
        switch (name) {
            case "John":
                System.out.println("Hello John");
                break;
            default:
                System.out.println("I don't know you!");
        }
        // if else if ladder
        int age = 28;
        if (age >= 18 && age <= 65) {
            System.out.println("You are an adult");
        } else if (age > 65) {
            System.out.println("You are a senior citizen");
        } else {
            System.out.println("You are not eligible to vote");
        }
        // ternary operator
        boolean isStudent = true;
        String studentOrNot = (isStudent) ? "Yes" : "No";
        System.out.println("Is the person a student? " + studentOrNot);
        // bitwise operators
        int num1 = 7, num2 = 9;
        System.out.println("Bitwise AND of " + num1 + " and " + num2 + " is " + (num1 & num2));
        System.out.println("Bitwise OR of " + num1 + " and " + num2 + " is " + (num1 | num2));
        System.out.println("Bitwise XOR of " + num1 + " and " + num2 + " is " + (num1 | num2));
        System.out.println("Left shift of " + num1 + " by 2 bits is " + (num1 << 2));
        System.out.println("Right shift of " + num1 + " by 3 bits is " + (num1 >> 3));

        // ----------------Random Game-----------------------
        while (true) {
            int num = (int) (Math.random() * 10 + 1);
            System.out.print(num + " ");
        }

    }
}

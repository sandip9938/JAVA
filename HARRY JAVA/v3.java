import java.util.Scanner;

public class v3 {
    public static void main(String[] args) {
        System.out.println("Class 3");
        // Getting user input

        //Sum of two number getting user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please type a num1 : ");
        int num1 =  sc.nextInt();
        System.out.print("Please type a num2 : ");
        int num2 =  sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is : " +sum);
    }
}

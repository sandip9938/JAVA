import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {
       sum();
    }
    static void sum(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int num1=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int num2=sc.nextInt();
        System.out.println("all rows number :" +num1);
        System.out.println("all column number :"+num2);
    }
}

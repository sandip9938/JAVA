import java.util.Scanner;

public class Pratce1 {
    public static void main(String[] args) {
        System.out.println("Practice set1");
        //Practice set -1

        // 1. Sum of three number

       Scanner sc = new Scanner(System.in);
        System.out.println("Please enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Please enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Please enter num3 : ");
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        System.out.println("Total number of sum is : " +sum);


        // 2.Calculate cgpa of three subject

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter sub1 mark : ");
        float sub1 = Sc.nextFloat();
        System.out.println("Enter sub2 mark : ");
        float sub2 = Sc.nextFloat();
        System.out.println("Enter sub3 mark : ");
        float sub3= Sc.nextFloat();
        float  cgpa = (sub1+sub2+sub3)/30;
        System.out.println("Total cgpa is : " +cgpa);


    }
}

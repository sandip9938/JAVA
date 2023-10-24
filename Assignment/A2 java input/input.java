import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    // Q1 - Input name, roll number and field of interest from user and print in the
    // format below : Name: xyz, Roll number: xyz, Field of interest: xyz
    Scanner sc = new Scanner(System.in);
    System.out.println("Print name :");
    String name = sc.next();
    System.out.println("Print Rollnum :");
    int rollnum = sc.nextInt();
    System.out.println("Print Feild of intrest :");
    String intrest = sc.next();

    // Q2 - Input two different string and print them in same line.
    System.out.print("Enter first string : ");
    String str1 = sc.nextLine();
    System.out.print("Enter second string : ");
    String str2 = sc.nextLine();
    System.out.println("\n" + str1 + " " + str2);

    // Q3 - If the marks of Robert in three subjects are entered through keyboard
    // (each out of 100), write a program to calculate his total marks and
    // percentage marks.
    int mark1 = sc.nextInt();
    int mark2 = sc.nextInt();
    int mark3 = sc.nextInt();
    int total_marks = mark1 + mark2 + mark3;
    int percentage = (total_marks / 3);
    System.out.println(total_marks);
    System.out.println(percentage + "%");

    // Q4 - Given two numbers, return their sum in the following format:Int t
    // representing number of test cases T lines of Two integers representing the
    // numbers to be added
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a + b);
    }

    // Q5 - Given few lines of input(number of lines unknown) where each line has
    // two strings, concatenate the strings.
    while (sc.hasNextLine()) {
      String a = sc.next();
      String b = sc.next();
      System.out.println(a + b);
    }
  }

}

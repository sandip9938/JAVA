package Harrybhai;

import java.util.Scanner;

public class GetuserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your address:");
        String address=sc.nextLine();
        System.out.println("Enter your phone number:");
        long phone=sc.nextLong();
        System.out.println("Enter your email:");
        String email=sc.nextLine();
        System.out.println("Enter your gender:");
        String gender=sc.nextLine();
        System.out.println("Enter your occupation:");
        String occupation=sc.nextLine();
        System.out.println("Enter your marital status:");
        String marital=sc.nextLine();
        System.out.println("Enter your education:");
        String education=sc.nextLine();
        System.out.println("Enter your income:");
        double income=sc.nextDouble();
        System.out.println("Enter your hobbies:");
        String hobbies=sc.nextLine();
        System.out.println("Enter your favorite color:");
        String color=sc.nextLine();
        System.out.println("Name:"+name+"\nAge:"+age+"\nAddress:"+address+"\nPhone Number:"+phone+"\nEmail:"+email+"\nGender:"+gender+"\nOccupation:"+occupation+"\nMarital
        Status:"+marital+"\nEducation:"+education+"\nIncome:"+income+"\nHobbies:"+hobbies+"\nFavorite Color:"+color);
        }
    


}
 
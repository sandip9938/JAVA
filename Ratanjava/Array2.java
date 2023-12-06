package Ratanjava;

import java.util.Scanner;

//Arrayclass2

public class Array2 {
    public static void main(String[] args) {

        //twonum();
        //greet();
        //sumtwo();
      /*
        int a=12;
      int b=90;
        swap( a ,  b);
        System.out.println(a + " " +b);

       */
    }


//Stack
      //  its gives a refernce
// Heap
       // its give a actuall value.



        //Add two number by input by function
        static void  twonum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls give num1 : ");
        int num1=sc. nextInt();
        System.out.println("Pls give num2 : ");
        int num2=sc. nextInt();
        int  twonum=num1+num2;
        System.out.println("total number is  : " +twonum  );
    }
    // Greeting Function
static String greet(){
String greeting="Happy new Year";
    System.out.println(greeting);
    return greeting;
}
    //Add two number by input by function using a, b
static int  sumtwo( ) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pls give a : ");
    int a = sc.nextInt();
    System.out.println("Pls give b: ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("total number is  : " + sum);
return sum;
}

static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;


    }

}

package Scalar;

import java.util.Scanner;

/**
 * Class2
 */
public class Class2 {

    public static void main(String[] args) {

        // ----String----
        String str1 = "Hello";
        System.out.println("str1: " + str1);

        // ----Multiple line String-----
        String str2 = """
                Hello World!
                This is a multiple
                line string.""";
        System.out.println("str2: " + str2);

        // -----------Comments------------
        /*
         * Comments are used to explain the code, they do not affect the execution of
         * program.
         * Single line comments- (//)
         * Multiple line comment - (/star(*) star(*)/)
         * 
         */

        // ---------------TypeCasting--------------
        /*
         * Typecasting is the process by which we convert one data type into another
         * data type.
         * Its a Two types.
         * 1=Widening typecasting(Automatically done by java)
         * 2=Explict TypeCasting(User defined)
         */

        // -----------Scanner Class ---------------
        /*
         * Scanner class in Java is an object that allows you to read input from the
         * keyboard or other devices such as file and network sockets.
         * Scanner class in Java provides methods for reading user input from console or
         * file.
         * It's an object that can read inputs as different primitive data types like
         * int, float, double etc.
         * It can read int, float, double, long and other primitive data types as well
         * as strings.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int num = sc.nextInt();
        System.out.printf("\nYou have entered %d", num);

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a your name : ");
        String name = scr.next();
        System.out.println(name);

        // ---------------Opreator-------------
        /*
         * Operators are symbols that perform operations on operands. They take two or
         * more values and return a single value based on the operation performed.
         * There are three main categories of operators: Arithmetic operators, Logical
         * operators, Bitwise operators.
         * 
         * ----------- Arithmetic Operators:----------------
         * Addition (+), Subtraction (-), Multiplication (*), Division(/), Modulus(%),
         * Increment(++), Decrement(--).
         * Addition (+): The addition operator adds two operands together.
         * Subtraction (-): The subtraction operator subtracts the second operand for
         * the first operand.
         * Multiplication (*): The multiplication operator multiplies two numbers.
         * Division /: The division operator divides the first operand by the second
         * operand.
         * Modulus %: The modulus operator returns the remainder when the first operand
         * is divided by the second operand.
         * 
         * ------------------Relational Opreator--------------------
         * Eqal(==),GraterThan(>).LessThan(<),Graeterthan Eqal(>=),Lessthan Eqal(<=),Not
         * Eqal(!=)
         * Equal ==: This operator returns true if both values on either side of it are
         * equal.
         * NotEqual !=: This operator returns false if both values on either side of it
         * are not equal.
         * Greater >: This operator returns true if value on left side is greater than
         * right side.
         * Less <: This operator returns true if value on left side is lesser than right
         * side.
         * GreaterOrEqual >=: This operator returns true if value on left side is
         * greater than or equal to right side.
         * 
         * 
         * ------------------Assignment and Eqaulity Opreator---------------------------
         * Assign (=): This operator assigns the value of the expression on its right
         * side to the variable on its left side.
         * 
         */
        // ----------Condition-------------------
        /*
         * 
         * Conditional statements in Java are used to execute certain blocks of code
         * depending upon the condition specified. If else statement is used as an
         * alternative to if statement. It checks whether the given expression evaluates
         * to true or false. If the expression is true, then only the corresponding
         * block of code will be executed otherwise the next block of code will be
         * skipped.
         * Conditional statements in Java are used to execute certain blocks of code
         * depending upon the condition specified. If the condition becomes true then
         * the block of code inside the conditional statement will be executed else it
         * won't.
         * 
         * if
         * else if
         * else
         * switch case
         * default :
         * break;
         * continue
         * 
         */
        int age = 25;
        if (age < 18) {
            System.out.println("Elgible for voting");
        } else {
            System.out.println("not eligile for voting");
        }

        // -----------------Ternary Opretor---------------------
        // result=(Condition)?Expression1(true):Expression2(false);
        String name1 = "John";
        boolean result = (name1 == "John") ? true : false;
        System.out.println(result);

        // ---------------------Logical Opreator-------------------------------
        /*
         * Logical operators are used to combine two or more conditions using logical
         * Logical operators perform operations between two values and return a single boolean value. The logical operators include AND(&&), OR(|), NOT(!).
         */

         int agePeople=25;
         String citZen="India";
         if(agePeople>18 & citZen=="India"){
            System.out.println("Eligible for Voting and Citizen");
         }else{
            System.out.println("Not Eligible for Voting and Citizen");
         }

    }
}

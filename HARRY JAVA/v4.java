import java.util.Scanner;

public class v4 {
    public static void main(String[] args) {
        System.out.println("Class 4");

        // Mark percentage Calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Math : ");
        float sub1=sc.nextFloat();
        System.out.print("PHY : ");
        float sub2=sc.nextFloat();
        System.out.print("CHE : ");
        float sub3=sc.nextFloat();
        float percentage =  (sub1+sub2+sub3)/300 * 100 ;
        System.out.println("Total  marks in percentage of PCM : " +percentage);

    }
}

package Harrybhai;

public class Chap1Praticeset1 {
    public static void main(String[] args) {
        //Strings java
        String str1 = "Hello";
        System.out.println("The value of string is : "+str1);
        // -----String Method-------
        //length()
        int len=str1.length();
        System.out.println("The length of string is : "+len);
        //toUpperCase()
        String str2 = "Hello";
        String str3 = str2.toUpperCase();
        System.out.println("The value of string is : "+str3);
        //toLowerCase()
        String str4 = "Hello";
        String str5 = str4.toLowerCase();
        System.out.println("The value of string is : "+str5);
        //trim()
        String str6 = "   Hello   ";
        String str7 = str6.trim();
        System.out.println("The value of string is : "+str7);
        //concat()
        String str8 = "Hello";
        String str9 = "World";
        String str10 = str8.concat(str9);
        System.out.println("The value of string is : "+str10);
        //indexOf()
        String str11 = "Hello World";
        int index = str11.indexOf("o");
        System.out.println("The index of 'o' is : "+index);
        //lastIndexOf()
        String str12 = "Hello World";
        int lastIndex = str12.lastIndexOf("o");
        System.out.println("The last index of 'o' is : "+lastIndex
        +"\n The first index of 'o' is : "+str12.indexOf("o"));
        //substring()
        String str13 = "Hello World";
        String str14 = str13.substring(6);
        System.out.println("The value of string is : "+str14);
        //split()
        String str15 = "Hello World";
        String[] str16 = str15.split(" ");
        System.out.println("The value of string is : "+str16[0
        ]+" "+str16[1]);
        //charAt()
        String str17 = "Hello World";
        char ch = str17.charAt(0);
        System.out.println("The value of char is : "+ch);
        //compareTo()
        String str18 = "Hello";
        String str19 = "world";
        int compare = str18.compareTo(str19);
        System.out.println("The compare value is : "+compare);
        





    }
}

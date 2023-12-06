package Ratanjava;
//Array in Dsa


public class Array {
    static  int add(int a,int b){
        return (a+b);
    }
    public static void main(String[] args) {
        //What is an Array
      /*  its store a group of same type element .
             Collection of homogenius data.
             Array is 0 based Index.
       */

        //Sunatx of Array Declaration
        /*
        int arr[]={12,34,56,34,34,22,35};
        System.out.println(arr);
         */
        int[] arr={12,34,56,34,34,22,35};
        System.out.println(arr[2]);
        System.out.println(arr[0]);
        System.out.println(arr);



int multiarr[][]={{12,34},{23,56},{24,69}};
        System.out.println(multiarr [0][1]);
        System.out.println(multiarr.length);



        //Array loop
        //-----For loop-------

        for(int i=0;i<arr.length;i++){

            System.out.println(i);
        }
        //-----ForEach loop-------
      /*
        for(int arry:arr){
            System.out.println(arry);
        }
           */




    }


}

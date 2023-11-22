package Scalar;

/**
 * Class4
 */
public class Class4 {

    public static void main(String[] args) {
        // ----------------Array--------------------------
        /*
         * Array is data structure that stores data of the same type in a seqential
         * manner. An array takes a contigous section of the memory.
         * ---------Types of Array--------------
         * 
         * 1. One-Dimensional Array
         * 2. Two-Dimensional Array
         * 3. Multi-Dimensional Array
         * 
         */
        // One Dimensonal Array-:
        int arr[] = new int[5]; // Declaration and Initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // Printing Array Elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is :" + arr[i]);
        }

        // -----For Each loop------
        for (int element : arr) {
            System.out.println("Element : " + element);
        }


        // Two Dimensional Array
        int mat[][] = { { 1, 2 }, { 3, 4 } };
        // Printing 2D Array Elements
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Element at index " + i + j + " is :" +
                        mat[i][j] + " ");
            }
            System.out.println();
        }

        
        // Multidimensional array
        int mat2[][] = { { 1, 2, 3 }, { 4, 5,
                6 }, { 7, 8, 9 } };
        // Printing 2D Array Elements
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print("Element at index " + i + j + " is :" +
                        mat2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
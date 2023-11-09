public class Class9 {
    public static void main(String[] args) {
        // Loops

        // ----------------Types of loop-------------------------
        // =============For Loop=============
        for (int i = 0; i < 15; i++) {
            System.out.println("Hello World");
        }
        // ==================While Loops===================
        while (true) {
            System.out.println("This is a While Loop!");
            break;
        }
        // ================Do While Loops==================
        do {
            System.out.println("This is a Do While Loop!");
            break;
        } while (false);
        // ============Nested For Loops=============
        int num = 2;
        for (int j = 0; j <= num; j++) {
            for (int k = 0; k <= num; k++) {
                if ((j == 0 || j == num) && (k == 0 || k == num)) {
                    continue;
                } else {
                    System.out.print((char) (64 + j));
                    System.out.print((char) (64 + k));
                    System.out.println();
                }
            }
        }

    }
}

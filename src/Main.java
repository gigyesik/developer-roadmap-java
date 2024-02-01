public class Main {
    public static void main(String[] args) {
        // Loop
        // for statement
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // for-each statement
        int arr[] = {12, 34, 56, 78};

        for (int num : arr) {
            System.out.println(num);
        }

        // while statement
        int i3 = 1;

        while (i3 <= 10) {
            System.out.println(i3);
            i3++;
        }

        // do-while statement
        int i4 = 1;

        do {
            System.out.println(i4);
            i4++;
        } while (i4 <= 10);

        // Exception Handling
        // printStackTrace()
        int a = 5;
        int b = 0;

//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
//        }

        // default Exception handler
//        String str = null;
//        System.out.println(str.length());

        // try catch finally
//        try {
//            int[] arr2 = new int[4];
//            int i = arr2[4];
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            System.out.println("Need to execute");
//        }
    }



}



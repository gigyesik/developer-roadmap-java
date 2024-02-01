package fundamental;

public class Loop {
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
    }
}

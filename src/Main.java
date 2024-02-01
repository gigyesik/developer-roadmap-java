public class Main extends ab {
    public static void main(String[] args) {
        // Conditional
        // if
        String today = "sat";

        if (today == "sat") {
            System.out.println("In my home");
        }

        // else if
        String today2 = "sun";
        String tomorrow = "mon";

        if (today2 == "sun") {
            System.out.println("In my home");
        } else if (tomorrow == "mon") {
            System.out.println("Go to work");
        }

        // else
        String weekend = "weekend";
        String weekday = "weekday";

        if (weekend == "weekend") {
            System.out.println("In my home");
        } else {
            System.out.println("Go to work");
        }

        // switch
        String day = "day";

        switch (day) {
            case "mon": System.out.println("Go to work");
            case "tue": System.out.println("Go to work");
            case "wed": System.out.println("Go to work");
            case "thu": System.out.println("Go to work");
            case "fri": System.out.println("Go to work");
            case "sat":	System.out.println("In my home");
            case "sun":	System.out.println("In my home");
        }

        // ternary operator
        int three = 3;
        String numberIs = (three % 2 == 0) ? "even" : "odd";
        System.out.println(numberIs);

        // Function
        // static method
        show();

        // instance method
        Main m = new Main();
        m.findEvenOdd(5); // odd

        // abstract method
        m.abMethod();

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

    // instance method
    public void findEvenOdd(int num){
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    static void show() {
        System.out.println("Static Method");
    }

    void abMethod() {
        System.out.println("abstract method");
    }

}

abstract class ab {
    abstract void abMethod();
}

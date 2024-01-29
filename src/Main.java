public class Main extends ab {
    public static void main(String[] args) {
        // Basic Syntax
        System.out.println("Hello world!");

        // 한줄 주석

        /*
            여러줄
            주석
        /*

        /**
            문서형 주석
        */

        // DataTypes, Variables
        // 타입, 변수명
        int a1, b1, c1;
        float pi1;
        double d1;
        char s1;

        // 타입, 변수명, 초기값
        int a2 = 1, b2 = 2, c2 = 3;
        float pi2 = 3.14f;
        double d2 = 12.34d;
        char s2 = 'g';

        class VariableType {
            static int a3 = 6; // 정적 변수
            int b3 = 7; // 인스턴스 변수
            void testMethod() {
                int c = 9; // 로걸 변수
            }
        }

        double d3;
        int i1 = 10;
        d3 = i1; // 자동 형변환이 일어나 d에는 10.0 이 저장된다.

        double d4 = 10;
        int i2;
        i2 = (int) d4; // 타입 캐스팅이 일어나 i에는 10 이 저장된다.

        byte x;
        int a4 = 270;
        double b4 = 128.128;
        x = (byte) a4; // x: 14 -> 손실. 데이터 오버플로우 (-128 ~ 127 사이의 값을 순환)
        a4 = (int) b4; // a: 128 -> 손실. 소수점 버림
        x = (byte) b4; // x: -128 -> 손실. 소수점 올림 후 데이터 오버플로우 (-128 ~ 127 사이의 값을 순환)

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

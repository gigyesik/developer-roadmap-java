package fundamental;

public class FunctionAndMethod extends ab{
    public static void main(String[] args) {
        // Function
        // static method
        show();

        // instance method
        FunctionAndMethod fm = new FunctionAndMethod();
        fm.findEvenOdd(5); // odd

        // abstract method
        fm.abMethod();

    }

    // instance method
    public void findEvenOdd(int num){
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    // static method
    static void show() {
        System.out.println("Static Method");
    }

    // abstract method
    void abMethod() {
        System.out.println("abstract method");
    }
}

abstract class ab {
    abstract void abMethod();
}

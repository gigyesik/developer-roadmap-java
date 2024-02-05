package fundamental;

public class ConcreteClass extends AbstractClass {
    @Override
    void method1() {

        System.out.println("Concrete Class Method");
    }

    public static void main(String[] args) {
        ConcreteClass cc = new ConcreteClass();
        cc.method1(); // Concrete Class Method
        cc.method2(); // In Abstract Class, Not Abstract Method
    }
}

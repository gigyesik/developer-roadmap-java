package fundamental;

public class DevClass1 implements DevInterface1, DevInterface2 {
    // 메서드 구현
    @Override
    public void method1(int a) {
        System.out.println(a);
    }

    @Override
    public void method2(int b) {
        System.out.println(b);
    }

    // 다중 상속
    @Override
    public void method3(int c) {
        System.out.println(c);
    }

    @Override
    public void method4(int d) {
        System.out.println(d);
    }

    public static void main(String[] args) {
        DevClass1 dc1 = new DevClass1();
        dc1.method1(1); // 1
        dc1.method2(2); // 2
        dc1.method3(3); // 3
        dc1.method4(4); // 4
        dc1.method5(); // default interface method
        DevInterface2.method6(); // static method
    }
}

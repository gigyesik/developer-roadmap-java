package fundamental;

public class DevClass2 implements DevInterface1 {
    // 다른 구현
    @Override
    public void method1(int a) {
        System.out.println(a + 1);
    }

    @Override
    public void method2(int b) {
        System.out.println(b + 1);
    }

    public static void main(String[] args) {
        DevClass2 dc2 = new DevClass2();
        dc2.method1(1); // 2
        dc2.method2(2); // 3
    }
}

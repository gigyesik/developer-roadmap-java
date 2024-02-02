package fundamental;

public class Dev1Class2 implements Dev1Interface1 {
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
        Dev1Class2 dc2 = new Dev1Class2();
        dc2.method1(1); // 2
        dc2.method2(2); // 3
    }
}

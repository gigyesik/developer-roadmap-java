package fundamental;

public class Dev1Class3 implements Dev1Interface3 {
    @Override
    public void method1(int a) {
        System.out.println(a);
    }

    @Override
    public void method2(int b) {
        System.out.println(b);
    }

    @Override
    public void method3(int c) {
        System.out.println(c);
    }

    @Override
    public void method4(int d) {
        System.out.println(d);
    }

    @Override
    public void method7() {
        System.out.println("method 7");
    }

    public static void main(String[] args) {
        Dev1Class3 dc3 = new Dev1Class3();
        dc3.method1(1); // 1
        dc3.method2(2); // 2
        dc3.method3(3); // 3
        dc3.method4(4); // 4
        dc3.method7(); // method 7
    }
}

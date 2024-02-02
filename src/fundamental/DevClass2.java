package fundamental;

public class DevClass2 implements DevInterface{
    @Override
    public void method1(int a) {
        System.out.println(a + 1);
    }

    @Override
    public void method2(int b) {
        System.out.println(b + 1);
    }
}

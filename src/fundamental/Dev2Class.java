package fundamental;

public class Dev2Class extends Dev2AbClass2{
    @Override
    public void method3() {
        System.out.println("method 3");
    }

    @Override
    public void method4() {
        System.out.println("method 4");
    }

    public static void main(String[] args) {
        // 인스턴스 생성
        Dev2Class d2c = new Dev2Class();
        // 상속 메서드
        d2c.method1(); // method1 on abstract class 1
        d2c.method2(); // method2 on abstract class 2
        // 구현 메서드
        d2c.method3(); // method3
        d2c.method4(); // method4

        // static 메서드
        Dev2Interface.method5(); // static method, private static method

        // default 메서드
        d2c.method8(); // default method, private method
    }
}

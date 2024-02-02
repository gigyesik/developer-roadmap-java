package fundamental;

public interface Dev2Interface {
    void method1();
    void method2();
    void method3();
    void method4();

    // JDK 9 이후 private, static 메서드 사용 가능
    // default 메서드에서 private 실행 가능
    default void method8() {
        System.out.println("default method");
        method6();
    }

    // static 메서드에서 private static 실행 가능
    static void method5() {
        System.out.println("static method");
        method7();
    }

    // private 메서드는 default 메서드에서 사용 가능
    private void method6() {
        System.out.println("private method");
    }

    // private static 메서드는 static 메서드에서 사용 가능
    private static void method7() {
        System.out.println("private static method");
    }
}

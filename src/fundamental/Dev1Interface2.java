package fundamental;

public interface Dev1Interface2 {
    void method3(int c);
    void method4(int d);

    // 정적 기본 메서드 구현 가능 (JDK 8 이후)
    static void method6() {
        System.out.println("static method");
    }
}

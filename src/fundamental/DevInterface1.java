package fundamental;

public interface DevInterface1 {
    int dev1 = 10;

    void method1(int a);
    void method2(int b);

    // 기본 구현 메서드 정의 가능 (JDK 8 이후)
    default void method5() {
        System.out.println("default interface method");
    }
}

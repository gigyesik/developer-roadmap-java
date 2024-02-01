package fundamental;

public class DataTypeAndVariable {
    public static void main(String[] args) {
        // DataTypes, Variables
        // 타입, 변수명
        int a1, b1, c1;
        float pi1;
        double d1;
        char s1;

        // 타입, 변수명, 초기값
        int a2 = 1, b2 = 2, c2 = 3;
        float pi2 = 3.14f;
        double d2 = 12.34d;
        char s2 = 'g';

        class VariableType {
            static int a3 = 6; // 정적 변수
            int b3 = 7; // 인스턴스 변수
            void testMethod() {
                int c = 9; // 로걸 변수
            }
        }

        double d3;
        int i1 = 10;
        d3 = i1; // 자동 형변환이 일어나 d에는 10.0 이 저장된다.

        double d4 = 10;
        int i2;
        i2 = (int) d4; // 타입 캐스팅이 일어나 i에는 10 이 저장된다.

        byte x;
        int a4 = 270;
        double b4 = 128.128;
        x = (byte) a4; // x: 14 -> 손실. 데이터 오버플로우 (-128 ~ 127 사이의 값을 순환)
        a4 = (int) b4; // a: 128 -> 손실. 소수점 버림
        x = (byte) b4; // x: -128 -> 손실. 소수점 올림 후 데이터 오버플로우 (-128 ~ 127 사이의 값을 순환)
    }
}

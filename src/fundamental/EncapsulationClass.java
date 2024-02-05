package fundamental;

public class EncapsulationClass {
    int a;
    int b;
    private int c;

    public EncapsulationClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getAPlusB() {
        System.out.println(a + b);
    }

    public void setC(int c) {
        if (c > 0) this.c = c;
    }

    public void getC() {
        System.out.println(c);
    }

    public static void main(String[] args) {
        EncapsulationClass ec = new EncapsulationClass(2, 3);
        ec.getAPlusB(); // 5
        ec.setC(4);
        ec.getC(); // 4
    }
}

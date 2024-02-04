package fundamental;

public class PolyChild1 extends PolyParent {
    int var = 2;

    @Override
    void method() {
        System.out.println("Child Class Method1");
    };

    public static void main(String[] args) {
        // 런타임에 메서드 오버라이딩
        PolyParent pp = new PolyChild1(); // upcasting. PolyChild is-a PolyParent
        pp.method(); // Child Class Method1
        System.out.println(pp.var); // 1
        pp = new PolyChild2();
        pp.method(); // Child Class Method2
        System.out.println(pp.var); // 1
        pp = new PolyGrandChild();
        pp.method(); // Grandchild Class Method
        System.out.println(pp.var); // 1
    }
}

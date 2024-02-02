package fundamental;

public class ChildClass extends ParentClass {
    // 자식 클래스에서 새로 정의한 필드
    public int merge;
    int b = 20;

    public ChildClass(int code, int commit, int merge) {
        // 부모 클래스의 필드 super 키워드로 주입
        super(code, commit);
        this.merge = merge;
    }

    // 새로운 메서드
    public void merge(int code) {
        merge += code;
    }

    // 오버라이딩
    @Override
    public String print() {
        return super.print() + " and now merge is " + merge;
    }

    // static 메서드는 오버라이딩 되는 것이 아니라 부모 method 가 hiding 됨
    public static void deploy() {
        System.out.println("deploy child");
    }

    // driver class method
    public static void main(String[] args) {
        ChildClass cc = new ChildClass(0,0, 0);
        System.out.println(cc.print()); // now code is 0 and commit is 0 and now merge is 0
        cc.coding(10);
        cc.commit(5);
        cc.merge(1);
        System.out.println(cc.print()); // now code is 10 and commit is 5 and now merge is 1
        System.out.println(cc.a + " " + cc.b); // 10 20
        ParentClass.deploy(); // deploy parent
        ChildClass.deploy(); // deploy child
    }
}

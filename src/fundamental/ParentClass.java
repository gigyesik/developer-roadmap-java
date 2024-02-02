package fundamental;

public class ParentClass {
    // 필드
    public int code;
    public int commit;
    // 부모 클래스에서 초기화한 변수
    int a = 10;

    // 생성자
    public ParentClass(int code, int commit) {
        this.code = code;
        this.commit = commit;
    }

    public void coding(int line) {
        code += line;
    }

    public void commit(int code) {
        commit += code;
    }

    public static void deploy() {
        System.out.println("deploy parent");
    }

    public String print() {
        return "now code is " + code + " and commit is " + commit;
    }
}

package fundamental;

public class ParentClass {
    // 필드
    public int code;
    public int commit;

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

    public String print() {
        return "now code is " + code + " and commit is " + commit;
    }
}

package advanced.serialization;

import java.io.*;

public class SerializationTest2 implements Serializable {
    private static final long serialversionUID = 123456789L;

    transient int a;
    static int b;
    int c;
    String d;

    public SerializationTest2(int a, int b, int c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static void main(String[] args) {
        SerializationTest2 serializationTest2 = new SerializationTest2(10, 20, 30, "Test");
        String fileName = "fileTest";

        // 직렬화
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(serializationTest2);

            output.close();
            file.close();

            System.out.println("Serialized");
            System.out.println(serializationTest2.a); // 10
            System.out.println(serializationTest2.b); // 20
            System.out.println(serializationTest2.c); // 30
            System.out.println(serializationTest2.d); // Test

            serializationTest2.b = 50; // static 데이터 변경
        } catch (IOException e) {
            System.out.println("Not Serialized");
        }

        serializationTest2 = null;

        // 역직렬화
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream output = new ObjectInputStream(file);

            serializationTest2 = (SerializationTest2) output.readObject();

            output.close();
            file.close();

            System.out.println("Deserialized");
            System.out.println(serializationTest2.a); // 0. transient 데이터는 직렬화되지 않음
            System.out.println(serializationTest2.b); // 50. static 데이터
            System.out.println(serializationTest2.c); // 30
            System.out.println(serializationTest2.d); // Test

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Not Deserialized");
        }
    }
}

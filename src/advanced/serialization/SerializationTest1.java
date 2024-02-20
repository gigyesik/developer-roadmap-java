package advanced.serialization;

import java.io.*;

public class SerializationTest1 implements Serializable {
    public int a;
    public String b;

    public SerializationTest1(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        SerializationTest1 serializationTest1 = new SerializationTest1(123, "Test");
        String fileName = "testFile";

        // 직렬화 (객체를 파일에 저장하기 위해 바이트코드화)
        try {
            // 파일에 객체 저장
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(serializationTest1);

            output.close();
            file.close();

            System.out.println("Serialized");
        } catch (IOException e) {
            System.out.println("Not Serialized");
        }

        SerializationTest1 resultObj = null;

        // 역직렬화 (파일 내 바이트코드를 객체로 변환)
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream input = new ObjectInputStream(file);

            resultObj = (SerializationTest1) input.readObject();
            input.close();
            file.close();

            System.out.println("Deserialized");
            System.out.println(resultObj.a); // 123
            System.out.println(resultObj.b); // Test

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Not Deserialized");
        }
    }
}

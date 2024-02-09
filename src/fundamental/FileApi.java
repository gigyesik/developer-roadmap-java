package fundamental;

import java.io.File;
import java.io.IOException;

public class FileApi {
    public static void main(String[] args) throws IOException {
        File file = new File("filetest.txt");
        file.createNewFile();

        file.exists(); // true
        file.getAbsolutePath();
        file.getName(); // filetest.txt
    }
}

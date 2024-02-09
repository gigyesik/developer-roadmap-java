package fundamental;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathApi {
    public static void main(String[] args) throws URISyntaxException, IOException {
        // Basic
        Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
        System.out.println(path);

        path = Path.of("c:/dev/licenses/windows/readme.txt");
        System.out.println(path);

        path = Path.of("c:" , "dev", "licenses", "windows", "readme.txt");
        System.out.println(path);

        path = Path.of("c:" , "dev", "licenses", "windows").resolve("readme.txt");
        System.out.println(path);

        path = Path.of(new URI("file:///c:/dev/licenses/windows/readme.txt"));
        System.out.println(path);

        path = Paths.get("c:/dev/licenses/windows/readme.txt");
        System.out.println(path);

        // Create
        path = Path.of("/src/fundamental");
        Path newDirectory;
        if (!Files.exists(path)) {
            newDirectory = Files.createDirectories(path.resolve("pathapi"));
        } else {
            newDirectory = path.resolve("pathapi");
        }
        System.out.println("newDirectory = " + newDirectory);

        Path newFile;
        if (!Files.exists(newDirectory.resolve("pathtest.txt"))) {
            newFile = Files.createFile(newDirectory.resolve("pathtest.txt"));
        } else {
            newFile = newDirectory.resolve("pathtest.txt");
        }
        System.out.println("newFile = " + newFile);

    }
}

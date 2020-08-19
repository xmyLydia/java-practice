package NIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @author mingyux
 */
public class ChannelMain {
    public static void main(String[] args) {
        try {
//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();
            Path dataPath = FileSystems.getDefault().getPath("data.txt");
            Files.write(dataPath, "\nLine 4".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(dataPath);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

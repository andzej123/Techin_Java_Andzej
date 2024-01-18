
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // test the method here
    }

    public static List<String> read(String file) throws IOException {
        return Files.lines(Paths.get(file)).collect(Collectors.toList());
    }

}

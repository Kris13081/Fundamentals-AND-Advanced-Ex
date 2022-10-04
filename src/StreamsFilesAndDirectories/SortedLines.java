package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortedLines {
    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\РС\\IdeaProjects\\fundamentals\\Advanced\\resourcesStreamsFilesAndDirectories\\input.txt";

        Path path = Paths.get(address);

        List<String> lines = Files.lines(path)
                .sorted()
                .collect(Collectors.toList());

        Files.write(Paths.get("06.SortLinesOutput.txt"), lines);

    }
}

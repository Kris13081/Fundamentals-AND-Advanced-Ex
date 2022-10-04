package StreamsFilesAndDirectoriesEX;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path firstFile = Paths.get("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\inputOne.txt");
        List<String> firstFileLines = Files.readAllLines(firstFile);

        Path secondFile = Paths.get("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\inputTwo.txt");
        List<String> secondFileLines = Files.readAllLines(secondFile);

        Path output = Paths.get("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\output.txt");
        Files.write(output, firstFileLines, StandardOpenOption.APPEND);
        Files.write(output, secondFileLines, StandardOpenOption.APPEND);

    }
}

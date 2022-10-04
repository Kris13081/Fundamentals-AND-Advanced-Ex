package StreamsFilesAndDirectoriesEX;

import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\input.txt"));

        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\output.txt"));
        bufferedReader.lines().forEach(line -> printWriter.println(line.toUpperCase()));

        bufferedReader.close();
        printWriter.close();
    }
}

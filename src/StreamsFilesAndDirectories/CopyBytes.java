package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\РС\\IdeaProjects\\fundamentals\\Advanced\\resourcesStreamsFilesAndDirectories\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("03.CopyBytesOutput.txt");
        PrintWriter printer = new PrintWriter(outputStream);

        int bytes = inputStream.read();
        Set<Integer> delimiters = Set.of(10, 32);

        while (bytes != -1) {

            boolean isDelimiter = delimiters.contains(bytes);

            if (isDelimiter) {
               printer.print((char) bytes);
            } else {
                printer.print(bytes);
            }
            bytes = inputStream.read();

        }
    }
}

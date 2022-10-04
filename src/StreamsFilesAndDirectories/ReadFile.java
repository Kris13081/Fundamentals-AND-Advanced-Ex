package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\РС\\IdeaProjects\\fundamentals\\Advanced\\resourcesStreamsFilesAndDirectories\\input.txt";

        FileInputStream  inputStream = new FileInputStream(path);

        int bytes = inputStream.read();

        while(bytes >= 0){
            System.out.printf("%s ", Integer.toBinaryString(bytes));
            bytes = inputStream.read();
        }
    }
}

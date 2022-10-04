package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\РС\\IdeaProjects\\fundamentals\\Advanced\\resoursesStreamsFilesAndDirectories\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("02.WriteToFileOutput.txt");

        Set<Character> punctuationTable = Set.of(',', '.', '!', '?');

        int oneByte = inputStream.read();

        while (oneByte != -1) {
            char symbol = (char) oneByte;

            boolean isPunctuation = punctuationTable.contains(symbol);

            if (!isPunctuation){
                outputStream.write(symbol);
            }

            oneByte = inputStream.read();
        }


    }
}

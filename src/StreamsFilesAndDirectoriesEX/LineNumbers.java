package StreamsFilesAndDirectoriesEX;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\inputLineNumbers.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\output.txt"));
        String line = br.readLine();
        int counter = 1;
        while(line != null){

            writer.println(counter + ". " + line);
            counter++;
            line = br.readLine();
        }
        br.close();
        writer.close();
    }
}

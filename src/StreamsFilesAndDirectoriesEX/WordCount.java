package StreamsFilesAndDirectoriesEX;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Scanner wordScanner = new Scanner(new FileReader("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\words.txt"));
        PrintWriter pr = new PrintWriter(new FileWriter("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\result.txt"));

        String[] wordsToSearch = wordScanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : wordsToSearch) {
            map.put(word, 0);
        }
        Scanner fileScanner = new Scanner(new FileReader("C:\\Users\\РС\\IdeaProjects\\Advanced\\resourcesStreamsFilesAndDirectoriesEX\\text.txt"));
        String singleWord = fileScanner.next();

        while (fileScanner.hasNext()) {
            if (map.containsKey(singleWord)) {
                int occurrences = map.get(singleWord);
                occurrences++;
                map.put(singleWord, occurrences);
            }
            singleWord = fileScanner.next();
        }
        map.forEach((key, value) -> pr.printf("%s - %d\n", key, value));
        fileScanner.close();
        wordScanner.close();
        pr.close();
    }
}

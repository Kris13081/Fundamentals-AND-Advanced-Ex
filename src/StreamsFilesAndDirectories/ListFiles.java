package StreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;

public class ListFiles {
    public static void main(String[] args) {

        String path = "C:\\Users\\РС\\IdeaProjects\\fundamentals\\Advanced\\resourcesStreamsFilesAndDirectories\\Files-and-Streams";

        File root = new File(path);

        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            File file = queue.poll();

            System.out.println(file.getName());

            File[] files = file.listFiles();

            if (files != null) {
                for (File f : files) {
                    queue.offer(f);
                }
            }

        }

    }
}

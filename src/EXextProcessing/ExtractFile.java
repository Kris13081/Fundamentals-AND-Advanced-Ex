package EXextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1, filePath.indexOf("."));
        String fileExtensions = filePath.substring(filePath.indexOf(".") + 1);
        System.out.println("File name: " + fileName);
        System.out.println("File extension: ".concat(fileExtensions));


        //   C:\Internal\training-internal\Template.pptx

    }
}

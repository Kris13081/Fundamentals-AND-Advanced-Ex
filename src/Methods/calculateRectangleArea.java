package Methods;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width =Double.parseDouble(scanner.nextLine());
        double height =Double.parseDouble(scanner.nextLine());
        int area = (int)rectangleArea(width, height);
        System.out.println(area);

    }
    static double rectangleArea (double width, double height){
        return width * height;
    }
}

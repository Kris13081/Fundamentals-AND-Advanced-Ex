package StackAndQueuesEX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfCommands = scanner.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numbersOfCommands; i++) {
            String command = scanner.next();

            if (command.equals("1")){
                stack.push(scanner.nextInt());
            }
            if (command.equals("2")){
                stack.pop();
            }
            if (command.equals("3")){
                for(int num:stack) {
                    if (maxNumber < num) {
                        maxNumber = num;
                    }
                }
                System.out.println(maxNumber);
            }

        }

    }
}

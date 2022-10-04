package StackAndQueuesEX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Deque<Integer> stack = new ArrayDeque<>();
        boolean containsNumber = false;

        int numbersToPush = Integer.parseInt(input[0]);
        int numbersToPop = Integer.parseInt(input[1]);
        int numberToSearch = Integer.parseInt(input[2]);


        for (int i = 0; i < numbersToPush; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (!stack.isEmpty()) {
            if (stack.contains(numberToSearch)) {
                containsNumber = true;
                System.out.println(containsNumber);
            } else {
                int minNumber = Integer.MAX_VALUE;
                for (int num : stack) {
                    if (num < minNumber) {
                        minNumber = num;
                    }
                }
                System.out.println(minNumber);
            }
        }else {
            System.out.println(0);
        }
    }
}

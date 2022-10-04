package StackAndQueuesEX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Deque<Integer> queue = new ArrayDeque<>();
        boolean containsNumber = false;

        int numbersToOffer = Integer.parseInt(input[0]);
        int numbersToPoll = Integer.parseInt(input[1]);
        int numberToSearch = Integer.parseInt(input[2]);


        for (int i = 0; i < numbersToOffer; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < numbersToPoll; i++) {
            queue.poll();
        }
        if (!queue.isEmpty()) {
            if (queue.contains(numberToSearch)) {
                containsNumber = true;
                System.out.println(containsNumber);
            } else {
                int minNumber = Integer.MAX_VALUE;
                for (int num : queue) {
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

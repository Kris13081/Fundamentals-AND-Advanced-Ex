package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistoryQueue = new ArrayDeque<>();
        String currentURL = null;

        String input = scanner.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (backHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    currentURL = input;
                    continue;
                } else {
                    forwardHistoryQueue.offer(currentURL);
                    System.out.println(backHistory.pop());
                    input = scanner.nextLine();
                }
            } else {
                if (currentURL != null) {
                    if (!input.equals("forward")) {
                        currentURL = input;
                        System.out.println(currentURL);
                        input = scanner.nextLine();
                        if (!input.equals("forward") && !input.equals("back")) {
                            backHistory.push(currentURL);
                        }
                    }
                }
            }


            if (input.equals("forward")) {
                if (forwardHistoryQueue.isEmpty()) {
                    System.out.println("no next URLs");
                    input = scanner.nextLine();
                    currentURL = input;

                } else {
                    backHistory.push(currentURL);
                    System.out.println(forwardHistoryQueue.poll());
                    input = scanner.nextLine();
                }
            }

        }
    }
}


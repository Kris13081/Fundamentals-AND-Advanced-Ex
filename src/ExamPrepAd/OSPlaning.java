package ExamPrepAd;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OSPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tasks::push);

        ArrayDeque<Integer> threads = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));


        int endTask = Integer.parseInt(scanner.nextLine());



        int threadThatKillsTask = 0;
        int thread = threads.peek();
        int task = tasks.peek();

        while (task != endTask) {

            if (thread > task || thread == task) {
                threads.poll();
                tasks.pop();
            } else {
                threads.poll();
            }
            thread = threads.peek();
            task = tasks.peek();
            threadThatKillsTask = thread;
        }
        System.out.printf("Thread with value %d killed task %d\n", threadThatKillsTask, endTask);
        for (Integer integer : threads) {
            System.out.print(integer + " ");
        }
    }
}

package Bai2XayDungLopStopWatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 100000;
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        selectionSort(array);

        stopWatch.stop();

        System.out.println("Time taken to sort the array: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

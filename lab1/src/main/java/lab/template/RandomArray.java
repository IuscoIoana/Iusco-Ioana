package lab.template;

import java.util.Random;

public class
RandomArray {
    public static void main(String[] args) {
        // Generate a random number between 10 and 100
        Random random = new Random();
        int size = random.nextInt(91) + 10;


        // Populate an array of that size with random integers
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        // Find the maximum and minimum values in the array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Print the results
        System.out.println("array size: " + size);
        System.out.println("Array elements: " + array.toString());
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}


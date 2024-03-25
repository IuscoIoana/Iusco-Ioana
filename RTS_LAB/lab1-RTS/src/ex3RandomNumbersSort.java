import java.util.Random;//I included this special libraries for random numbers
import java.util.Arrays;
public class ex3RandomNumbersSort {
    public static void main(String[] args) {
        // Create an array to store 10 random numbers
        int[] numbers = new int[10];

        // Create a Random object to generate random numbers
        Random rand = new Random();

        // Generate 10 random numbers and store them in the array
        System.out.println("Generated Random Numbers:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); //  belongs to [0,99]
            System.out.print(numbers[i] + " ");
        }

        // Sort the array
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("\nSorted Numbers:");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

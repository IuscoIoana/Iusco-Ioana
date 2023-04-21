package isp.lab2.Exercise3SumOfIntegersRecursive;

import java.util.Scanner;
public class Exercise3SumOfIntegersRecursive {
    public static int sumRecursive(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumRecursive(n - 1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Enter a number: ");
        System.out.printf("The sum of all positive integers from 1 to 'n' is: %d%n", sumRecursive(n));
    }

}





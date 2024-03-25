import java.util.Scanner;

class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition of Complex numbers "+"
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    // Subtraction of Complex numbers "-"
    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    // Multiplication of Complex numbers "*"
    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        double realPart = c1.real * c2.real - c1.imaginary * c2.imaginary;
        double imaginaryPart = c1.real * c2.imaginary + c1.imaginary * c2.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class ComplexNumberApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber c1 = new ComplexNumber(real1, imaginary1); //create a new object
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2); //create the second object

        System.out.println("Select the operation:\n1. Addition\n2. Subtraction\n3. Multiplication");
        int choice = scanner.nextInt();

        switch (choice) { //finalization
            case 1:
                System.out.println("Result of addition: " + ComplexNumber.add(c1, c2));
                break;
            case 2:
                System.out.println("Result of subtraction: " + ComplexNumber.subtract(c1, c2));
                break;
            case 3:
                System.out.println("Result of multiplication: " + ComplexNumber.multiply(c1, c2));
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
}//2+5i
}//4-i
}//sa faci fiecare separat asa cumva in diferite package-uri
package isp.lab2.Exercise5EvenOddSearch;
        import java.util.*;
        import java.lang.*;
public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] num = input.split("[,]", 0);
        int even =Integer.MIN_VALUE;
        int odd = Integer.MAX_VALUE;
        int ieven = 0;
        int iodd = 0;
        for (int i = 0; i< num.length; i++) {
            int nr = Integer.parseInt(num[i].trim());
            if(nr%2==0 && nr>even)
            {
                even = nr;
                ieven = i;
            }
            else if(nr%2!=0 && nr<odd)
            {
                odd = nr;
                iodd = i;
            }
        }
        if(ieven == -1)
           System.out.println("There are no even numbers in the list given.");
        else System.out.println("Largest even number is:"+even+", and it's position is:"+ieven);
        if(iodd == -1)
          System.out.println("There are no odd numbers in the list given");
        else System.out.println("The smallest odd number is:"+odd+", and it's position is:"+iodd);

        return new int[]{even,ieven,odd,iodd};
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = readFromConsoleInt();
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
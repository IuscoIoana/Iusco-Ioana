
package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        Random rd = new Random(100);
        for(int i = 0; i < n; i++)
            array[i]= rd.nextInt();
        //TODO: implement the logic to fill the array with random numbers
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int [] m = new int[2];
        int temp;
        for(int i = 0; i < array.length; i++ )
        {
            for(int j = i + 1; j < array.length; j++)
                if(array[i]>array[j])
                {
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
        }
        m[0] = array[0];
        m[1] = array[array.length-1];
        return m;
    }

    public static void main(String[] args) {

        Random random = new Random(50);

        //genereaza numar random intre 10 si 100
        //low = 10; high = 100;
        //result = random.nextInt(high-low)+10
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        for(int i = 0; i< a.length ; i++)
            System.out.println(a[i]);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
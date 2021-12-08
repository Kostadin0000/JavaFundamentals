package Exercise;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public  class ada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int minimum = getMin(array);
        System.out.println(minimum);
    }

    private static int getMin(int[] array) {
        int min = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
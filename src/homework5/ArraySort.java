package homework5;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        Arrays.sort(numbers);
        for (int x : numbers) {
            System.out.print(x + ", ");

        }
    }
}


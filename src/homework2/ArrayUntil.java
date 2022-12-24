package homework2;

public class ArrayUntil {

    public static void main(String[] args) {

        int[] array = {15, 8, 41, 69, 54, 70, 32, 25, 74, 85};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        System.out.println();

        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("min value:" + minValue);

        int maxValue = array[0];

        for (int i = 1; i < array.length ; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("max value:" + maxValue);



    }
}

package homework2;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {15, 8, 41, 69, 54, 70, 32, 25, 74, 85};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }

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

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("max value:" + maxValue);

//
        System.out.print("Մասիվի զույգ էլեմենտներն են՝ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }

        System.out.println();

        System.out.print("Մասիվի կենտ էլեմենտներն են՝ ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();
//        Տպեք զույգերի քանակը։
//        Տպեք կենտերի քանակը
        System.out.print("Մասիվի բոլոր թվերի միջին թվաբանականն է՝ ");
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.print(result / 5);

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println("Մասիվի էլեմենտների գումարն է՝ " + result);
        System.out.println("Մասիվի առաջին էլեմենտն է՝ " + array[0]);

        int lastIndex = array.length - 1;
        System.out.println("Մասիվի վերջին էլեմենտն է՝ " + array[lastIndex]);
//        Տպեք մասիվի մեջտեղի էլեմենտը։


        }
    }

package homework6;

public class ArrayUtil {
    void array (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    void minValue (int [] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("min value:" + minValue);
    }

    void maxValue (int [] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("max value:" + maxValue);
    }

    void evenElements (int [] array) {
        System.out.print("Մասիվի զույգ էլեմենտներն են՝ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void oddElements (int [] array) {
        System.out.print("Մասիվի կենտ էլեմենտներն են՝ ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.print(array[j] + " ");
            }
        }
    }

    void evenCount (int [] array) {
        System.out.print("Զույգերի քանակը՝ ");
        int evenCount = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);
    }

    void oddCount (int [] array) {
        System.out.print("Կենտերի քանակը՝ ");
        int oddCount = 0;
        for (int x : array) {
            if (x % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);
    }

    void mean (int [] array) {
        System.out.print("Մասիվի բոլոր թվերի միջին թվաբանականն է՝ ");
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.print(result / array.length);
    }

    void result (int [] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println("Մասիվի էլեմենտների գումարն է՝ " + result);
    }

    void firstElement (int [] array) {
        System.out.println("Մասիվի առաջին էլեմենտն է՝ " + array[0]);
    }

    void lastElement (int [] array) {
        int lastIndex = array.length - 1;
        System.out.println("Մասիվի վերջին էլեմենտն է՝ " + array[lastIndex]);
    }

    void meanElement (int [] array) {
        System.out.println("Մասիվի մեջտեղի էլեմենտն է՝ " + array[array.length/2]);
    }
}


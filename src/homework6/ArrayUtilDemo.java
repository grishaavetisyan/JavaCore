package homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        ArrayUtil au = new ArrayUtil();
        int[] array = {15, 8, 41, 69, 54, 70, 32, 25, 74, 85};
        au.array(array);
        System.out.println();
        au.minValue(array);
        System.out.println();
        au.maxValue(array);
        System.out.println();
        au.evenElements(array);
        System.out.println();
        au.oddElements(array);
        System.out.println();
        au.evenCount(array);
        System.out.println();
        au.oddCount(array);
        System.out.println();
        au.mean(array);
        System.out.println();
        au.result(array);
        System.out.println();
        au.firstElement(array);
        System.out.println();
        au.lastElement(array);
        System.out.println();
        au.meanElement(array);

    }
}

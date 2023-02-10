package homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length)
            extend();
        array[size++] = value;
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("սխալ ինդեքս");
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void remove ()  {
        int removeIndex = 2;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == removeIndex) {


        }
        }
    }
}


package homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(9);
        da.add(5);
        da.add(849);
        da.print();
        System.out.println();
        System.out.println(da.getByIndex(2));
        da.remove();
    }
}

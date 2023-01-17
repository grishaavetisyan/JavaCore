package homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        System.out.print("Գումարը հավասար է " + myCal.plus());
        System.out.println();
        System.out.print("Տարբերությունը հավասար է " + myCal.minus());
        System.out.println();
        System.out.print("Քանորդը հավասար է " + myCal.divide());
        System.out.println();
        System.out.print("Արտադրյալը հավասար է " + myCal.multiply());
    }
}

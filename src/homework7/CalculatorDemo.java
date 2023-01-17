package homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        System.out.println("Գումարը հավասար է " + myCal.plus());
        System.out.println("Տարբերությունը հավասար է " + myCal.minus());
        System.out.println("Քանորդը հավասար է " + myCal.divide());
        System.out.println("Արտադրյալը հավասար է " + myCal.multiply());
    }
}

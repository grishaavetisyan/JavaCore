package homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        int a = myCal.plus();
        System.out.print("Գումարը հավասար է " + a);
        System.out.println();
        int b = myCal.minus();
        System.out.print("Տարբերությունը հավասար է " + b);
        System.out.println();
        int c = myCal.divide();
        System.out.print("Քանորդը հավասար է " + c);
        System.out.println();
        double d = myCal.multiply();
        System.out.print("Արտադրյալը հավասար է " + d);
    }
}

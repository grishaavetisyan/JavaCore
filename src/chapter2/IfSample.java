package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y ;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x-ը փոքր է y-ից");

        x = x * 2;
        if (x == y) System.out.println("x-ը հիմա հավասար է y-ին");

        x = x * 2;
        if (x > y) System.out.println("x-ը այժմ մեծ է y-ից");

        if (x == y) System.out.println("դուք ոչ մի բան չեք տեսնի");
    }
}

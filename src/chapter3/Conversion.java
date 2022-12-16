package chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\n int-ի փոխակերպում byte-ի։");
        b = (byte) i;
        System.out.println("i-ն և b-ն " + i + " " + b);

        System.out.println("\n double-ի փոխակերպում int-ի։");
        i = (int) d;
        System.out.println("d-ն և i-ն" + d + " " + i);

        System.out.println("\n double-ի փոխակերպում byte-ի։");
        b = (byte) d;
        System.out.println("d-ն և b-ն " + d + " " + b);

    }
}

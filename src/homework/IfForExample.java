package homework;

public class IfForExample {
    public static void main(String[] args) {
        int a, b;
        a = 15;
        b = 8;

        if (a > b) System.out.println("max: " + a);
        if (a < b) System.out.println("max: " + b);

        System.out.println();

        for (b = 8; b <= a ; b++ )
            System.out.print(b + ", ");

        System.out.println();

//        char c, d;
//        c = (char) a;
//        System.out.print(c);
//        d = (char) b;
//        System.out.print(d);

        System.out.println();

        if (a == b) System.out.println("ա-ն հավասար է բ-ի");
        else System.out.println("ա-ն հավասար չէ բ-ի");
    }
}

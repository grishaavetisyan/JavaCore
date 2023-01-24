package chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        BoxClone mybox1 = new BoxClone(10,20,15);
        BoxClone mybox2 = new BoxClone();
        BoxClone mycube = new BoxClone(7);

        BoxClone myclone = new BoxClone(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("Obyom mybox1 " + vol);
        vol = mybox2.volume();
        System.out.println("Obyom mybox2 " + vol);
        vol = mycube.volume();
        System.out.println("Obyom mycube " + vol);
        vol = myclone.volume();
        System.out.println("Obyom myclone " + vol);

    }
}

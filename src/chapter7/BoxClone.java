package chapter7;

public class BoxClone {
    double width;
    double height;
    double depth;

    BoxClone(BoxClone ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxClone(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxClone() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxClone(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

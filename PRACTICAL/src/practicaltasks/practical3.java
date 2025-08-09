package practicaltasks;
class Box {
    double width, height, depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}
public class practical3 {
    public static void main(String[] args) {
       
        Box b1 = new Box(15, 32, 10);
        Box b2 = new Box(4, 3, 2);

        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
    }
}



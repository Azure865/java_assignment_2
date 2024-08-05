package QWE_B;

public class main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4,8);

        System.out.println(r1.toString());
        System.out.println("Area of Rectangle " + r1.getArea());
        System.out.println("Perimeter of Rectangle " + r1.getPerimeter());
        System.out.println(">>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(r2.toString());
        System.out.println("Area of Rectangle " + r2.getArea());
        System.out.println("Perimeter of Rectangle " + r2.getPerimeter());

    }
}

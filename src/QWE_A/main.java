package QWE_A;

public class main {
 public static void main(String[] args) {
     Circle cr = new Circle();
     Circle cr2 = new Circle(5);
     Circle cr3 = new Circle(3 , "blue");


     System.out.println("Circle 1 - Radius: " + cr.getRadius());
     System.out.println("Circle 1 - Area: " + cr.getArea());
     System.out.println("Circle 1 - Circumference: " + cr.getCircumference());
     System.out.println("Circle 1 - Details: " + cr.toString());
     System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<");

     // Displaying information about circle2
     System.out.println("Circle 2 - Radius: " + cr2.getRadius());
     System.out.println("Circle 2 - Area: " + cr2.getArea());
     System.out.println("Circle 2 - Circumference: " + cr2.getCircumference());
     System.out.println("Circle 2 - Details: " + cr2.toString());
     System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<");
     // Updating radius of circle2 and displaying updated information
     cr2.setRadius(5.0);
     cr2.setColor("green");
     System.out.println("Updated Circle 2 - Radius: " + cr2.getRadius());
     System.out.println("Updated Circle 2 - Area: " + cr2.getArea());
     System.out.println("Updated Circle 2 - Circumference: " + cr2.getCircumference());
     System.out.println("Updated Circle 2 - Details: " + cr2.toString());

 }
}

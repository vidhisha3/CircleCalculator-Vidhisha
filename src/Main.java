import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        //Finding the Circumference
        double circleCircumference = 2*3.14159265359*circleRadius;
        System.out.println("the Circumference of Circle = "+circleCircumference);

        //finding the Area of Circle
         double circleArea = 3.14159265359*(circleRadius * circleRadius);
        System.out.println("the area of circle is = " + circleArea);

        // finding the diameter
        double circleDiameter= 2*circleRadius;
        System.out.println("the diameter of circle = " + circleDiameter );

    }
}

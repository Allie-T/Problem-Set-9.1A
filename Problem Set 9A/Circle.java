
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape{
   //Attributes
   private double radius;
   //constructor
   public Circle(String color, boolean filled, double radius){
       super(color,filled);
       this.radius = radius;
   }
   public double getRadius(){
       return radius;
   }
   public void setRadius(double r){
       radius = r;
   }
   @Override
   public double calculateArea(){
       return Math.PI * radius * radius;
   }
   @Override
   public double calculatePerimeter(){
       return 2*Math.PI*radius;
   }
}


/**
 * Write a description of class ShapeDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShapeDriver {
   public static void main (String []args){
       Shape[] shapes = new Shape[6];
       
       shapes[0] = new Circle("yellow", true, 5);
       shapes[1] = new Rectangle("blue",true, 10, 5);
       shapes[2] = new Triangle("red", false, 5, 5, 5);
       shapes[3] = new Square("green", false, 10);
       shapes[4] = new Pentagon("orange", true, 5);
       shapes[5] = new House("white", true, 10);
       
       //displaying calculated area
       System.out.println("Area: ");
       for (int i = 0; i< shapes.length; i++){
           System.out.println(shapes[i].calculateArea());
       }
       
       //displaying calculated perimeter
       System.out.println("\nPerimeter: ");
       for (int i = 0; i< shapes.length; i++){
           System.out.println(shapes[i].calculatePerimeter());
       }
       
       
       
       
           
       
   }
}

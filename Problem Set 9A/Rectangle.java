
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(String color, boolean filled, double length, double width){
       super(color, filled);
       this.length = length;
       this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double l){
        length = l;
    }
    public void setWidth(double w){
        width = w;
    }
    @Override
    public double calculateArea(){
        return length * width;
    }
    @Override
    public double calculatePerimeter(){
        return length + length + width+ width;
    }
}

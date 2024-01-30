
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape{
    // Instance Variables /Attributes
    private String color;
    private boolean filled;
    
    // Constructor
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    // Behaviour methods    
    public double calculateArea(){
        return 0.0;
    }
    public double calculatePerimeter(){
        return 0.0;
    }
    public void displayInfo(){
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setColor(String c){
        color = c;
    }
    public void setFilled(boolean f){
        filled = f;
    }
}


/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Rectangle{
    private double side;
    public Square(String color, boolean filled, double s){
        super(color, filled, s,s);
        side = s;
    }
    public double getSide(){
       return side; 
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return side * side;
    }
    public double calculatePerimeter(){
        return 4 * side;
    }
}


/**
 * Write a description of class Pentagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pentagon extends Square{
    private double side;
    public Pentagon(String color, boolean filled, double side){
        super(color,filled,side);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        side = s;
    }
    @Override
    public double calculateArea(){
        return (0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * Math.pow(side, 2);
    }
    @Override
    public double calculatePerimeter(){
        return 5*side;
    }
}

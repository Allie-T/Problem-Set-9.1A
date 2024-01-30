
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House extends Shape{
    private Square base;
    private Triangle roof;
    public House(String color, boolean filled,double side){
        super(color, filled);
        base = new Square(color, filled, side);
        roof = new Triangle(color, filled, side, side, side);
    }
    public double getSide(){
        return base.getSide();
    }
    public void setSide(double s){
        base = new Square(getColor(), isFilled(), s);
        roof = new Triangle(getColor(), isFilled(), s, s, s);
    }
    
    @Override
    public double calculateArea(){
        return base.calculateArea() + roof.calculateArea();
    }
    @Override
    public double calculatePerimeter(){
        return 5 * getSide();
    }
}

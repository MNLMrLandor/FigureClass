public class Circle extends Figure{
    private final double radius;

    public Circle(double r){
        super(0);
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return (Math.PI * (Math.pow(radius, 2)));
    }
    @Override
    public String toString(){
        return String.format("Name = Rectangle \n " +
                        "radius = %.2f \n " +
                        "Area = %.2f",
                        radius, this.getArea());
    }
}

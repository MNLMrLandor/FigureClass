public class Triangle extends Figure{
    private final double height;
    private final double base;

    public Triangle(double h, double b){
        super(3);
        this.base = b;
        this.height = h;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea(){
        return ((base * height)/2);
    }
    @Override
    public String toString(){
        return String.format("Name = Triangle \n " +
                        "Base = %.2f \n " +
                        "Height = %.2f \n " +
                        "Area = %.2f",
                        base, height, this.getArea());

    }

}

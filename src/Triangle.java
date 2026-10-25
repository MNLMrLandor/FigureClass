public class Triangle extends Figure{
    private double height;
    private double base;

    public Triangle(double h, double b){
        super(3);
        this.base = b;
        this.height = h;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
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

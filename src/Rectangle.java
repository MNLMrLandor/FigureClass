public class Rectangle extends Figure{
    private final double length;
    private final double width;

    public Rectangle(double l, double w){
        super(4);
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public String toString(){
            return String.format(" Name = Rectangle \n " + //hardcoded name and number of sides because it will not change
                            "Number of sides: 4 \n" +
                            " Length = %.2f \n " +
                            "Width = %.2f \n " +
                            "Area = %.2f\n",
                    length, width, this.getArea());
        }
}

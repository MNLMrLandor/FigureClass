public abstract class Figure implements FigureInterface{
    private int numberOfSides;

    public Figure(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }
    abstract double getArea();
}

public abstract class Figure implements FigureInterface{
    private final int numberOfSides;

    public Figure(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }
    abstract double getArea();
}

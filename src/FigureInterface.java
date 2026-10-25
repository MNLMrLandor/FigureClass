public interface FigureInterface {
    default void printFigureName(){
        System.out.printf("Figure Name: %s", getClass().getName());
    }

    int getNumberOfSides();
}

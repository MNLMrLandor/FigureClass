public interface FigureInterface {
    default void printFigureName(){
        System.out.printf("Figure Name: %s\n", getClass().getName());
    }

    int getNumberOfSides();
}

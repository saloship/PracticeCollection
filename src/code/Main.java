package code;

public class Main {

    public static void main(String[] args) {
         getProgram(BaseSolutionFactory.REORDER_DATA_LOG_FILE).solveIt();
    }

    public static BaseSolution getProgram(int progType) {
        return BaseSolutionFactory.provideBaseSolution(progType);
    }
}

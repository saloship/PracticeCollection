package code;

public class Main {

    public static void main(String[] args) {
         getProgram(BaseSolutionFactory.SINGLE_ROW_KEYBOARD).solveIt();
    }

    public static BaseSolution getProgram(int progType) {
        return BaseSolutionFactory.provideBaseSolution(progType);
    }
}

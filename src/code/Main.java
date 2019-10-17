package code;

public class Main {

    public static void main(String[] args) {
         getProgram(BaseSolutionFactory.TWO_SUM_LESS_THAN_K).solveIt();
    }

    public static BaseSolution getProgram(int progType) {
        return BaseSolutionFactory.provideBaseSolution(progType);
    }
}

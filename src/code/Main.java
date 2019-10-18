package code;

public class Main {

    public static void main(String[] args) {
         getProgram(BaseSolutionFactory.MOST_COMMON_WORD).solveIt();
    }

    public static BaseSolution getProgram(int progType) {
        return BaseSolutionFactory.provideBaseSolution(progType);
    }
}

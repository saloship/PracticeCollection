package code;

public class Main {

    public static void main(String[] args) {
         getProgram(BaseSolutionFactory.VALID_PALINDROME).solveIt();
    }

    public static BaseSolution getProgram(int progType) {
        return BaseSolutionFactory.provideBaseSolution(progType);
    }
}

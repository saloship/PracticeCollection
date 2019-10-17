package code;

public class BaseSolutionFactory {

    public static final int TWO_SUM_LESS_THAN_K = 1;

    public static BaseSolution provideBaseSolution(int progType) {
         switch (progType) {
             case TWO_SUM_LESS_THAN_K:
                 return new Lc1099_TwoSumLessThanK();
             default:
                 return null;
         }
    }

}

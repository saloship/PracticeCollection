package code;

public class BaseSolutionFactory {

    public static final int TWO_SUM_LESS_THAN_K = 1099;
    public static final int REORDER_DATA_LOG_FILE = 937;

    public static BaseSolution provideBaseSolution(int progType) {
         switch (progType) {
             case TWO_SUM_LESS_THAN_K:
                 return new Lc1099_TwoSumLessThanK();
             case REORDER_DATA_LOG_FILE:
                 return new Lc937_ReorderDataLogFiles();
             default:
                 return null;
         }
    }

}

package code;

import java.util.HashMap;
import java.util.Map;

public class Lc760_FindAnagramMapping extends BaseSolution{

    @Override
    public void solveIt() {

    }

    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < B.length; i++) {
            indexMap.put(B[i], i);
        }

        int[] mapper = new int[A.length];
        for(int i = 0; i < B.length; i++) {
            mapper[i] = indexMap.get(A[i]);
        }

        return mapper;
    }
}

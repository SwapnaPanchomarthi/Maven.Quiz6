package rocks.zipcode.io.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {

        // N stores total number of subsets
        long N = (long) Math.pow(2, originalSet.size());

        // Set to store subsets
        Set<Set<Integer>> result = new HashSet<>();

        // generate each subset one by one
        for (int i = 0; i < N; i++)
        {
            Set<Integer> set = new HashSet<>();

            // check every bit of i
            for (int j = 0; j < originalSet.size(); j++)
            {
                // if j'th bit of i is set, add S.get(j) to current set
                if ((i & (1 << j)) != 0)
                    set.add(i);
            }
            result.add(set);
        }

        return null;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}

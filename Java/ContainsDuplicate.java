package Java;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (!seenNumbers.add(num)) {
                return true;
            }
        }
        return false;
    }
}

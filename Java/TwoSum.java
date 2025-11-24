package Java;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] findIndices(int[] numbers, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            int currentNumber = numbers[currentIndex];
            int requiredComplement = target - currentNumber;

            if (seenNumbers.containsKey(requiredComplement)) {
                int complementIndex = seenNumbers.get(requiredComplement);
                return new int[] { complementIndex, currentIndex };
            }
            seenNumbers.put(currentNumber, currentIndex);
        }
        throw new IllegalArgumentException("Nenhuma solução encontrada para os números fornecidos");
    }
}
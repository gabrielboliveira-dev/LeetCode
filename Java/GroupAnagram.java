package Java;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> groupedAnagrams = new HashMap<>();

        for (String currentWord : strs) {
            char[] characters = currentWord.toCharArray();
            Arrays.sort(characters);
            String sortedKey = new String(characters);
            groupedAnagrams.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(currentWord);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}

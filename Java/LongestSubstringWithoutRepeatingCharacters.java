package Java;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> windowChars = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            while (windowChars.contains(currentChar)) {
                windowChars.remove(s.charAt(left));
                left++;
            }

            windowChars.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);

            right++;
        }

        return maxLength;
    }
}

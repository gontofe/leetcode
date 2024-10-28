package leetcode75;

import static java.lang.Math.min;

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        int minLength = min(word1.length(), word2.length());
        String longest = word1.length() > word2.length() ? word1 : word2;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(i));
        }

        if (word1.length() != word2.length()) {
            builder.append(longest, minLength, longest.length());
        }

        return builder.toString();
    }
}

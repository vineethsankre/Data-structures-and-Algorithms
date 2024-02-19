package Concepts.HashTables.Problems;

import java.util.HashMap;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // Create a HashMap to store characters and their indices
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if the character is already in the HashMap
            if (map.containsKey(c)) {
                // If yes, update the start pointer to skip repeated characters
                start = Math.max(start, map.get(c) + 1);
            }
            // Update the character's index in the HashMap
            map.put(c, i);
            // Update the maxLength if the current substring is longer
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}


package Concepts.HashTables.Problems;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!sToT.containsKey(charS)) {
                sToT.put(charS, charT);
            } else if (sToT.get(charS) != charT) {
                return false;
            }
            if (!tToS.containsKey(charT)) {
                tToS.put(charT, charS);
            } else if (tToS.get(charT) != charS) {
                return false;
            }
        }
        return true;
    }
}


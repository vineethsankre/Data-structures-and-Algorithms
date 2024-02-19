package Concepts.HashTables.Problems;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public Map<String, Integer> countWordFrequency(String[] words) {
        Map<String,Integer> frequencyMap = new HashMap<>();
        for(String word: words){
            frequencyMap.put(word, frequencyMap.getOrDefault(word,0)  + 1);
        }

        return frequencyMap;
    
    }
}

package Concepts.HashTables.Problems;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Create a HashSet to store elements of nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Create a HashSet to store the intersection of nums1 and nums2
        Set<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            // Check if the current element of nums2 is in set1
            if (set1.contains(num)) {
                intersect.add(num); // If so, add it to the intersection set
            }
        }
        
        // Convert the intersection set to an array
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }
        
        return result;
    }
}


// Solution to LeetCode 49: Group Anagrams
// Category: Arrays and Hashing
// Difficulty: Medium

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC49 {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs)
        {
            char[] charAry = s.toCharArray();
            Arrays.sort(charAry);
            String sorted = new String(charAry);
            if (!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());

    }
}

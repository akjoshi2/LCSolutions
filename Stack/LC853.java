// Solution to LeetCode 853: Car Fleet
// Category: Stack
// Difficulty: Medium

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class LC853 {
	   public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < position.length; i++)
        {
            map.put(position[i], (double)(target - position[i]) / speed[i]);
        }
        int ans = 0;
        double current = 0;
        for (double time: map.values())
        {
            if (time > current)
            {
                current = time;
                ans++;
            }
        }
        return ans;
    }
}
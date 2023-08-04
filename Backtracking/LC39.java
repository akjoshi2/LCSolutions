import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC39
{
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    public void helper(List<List<Integer>> ans, List<Integer> curr, int[] candidates, int target, int start)
    {
        if (target == 0)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        else if (target < 0)
        {
            return;
        }
        for (int i = start; i < candidates.length; i++)
        {
            if (candidates[i] <= target)
            {
                curr.add(candidates[i]);
                helper(ans, curr, candidates, target-candidates[i], i);
                curr.remove(curr.size() - 1);
            }
        }
        return;
    }
}
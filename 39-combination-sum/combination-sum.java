class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(candidates, target, 0, current, result);
        return result;
    }
    public void backtrack(int[] candidates, int target, int start,
                      List<Integer> current, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0) {
            return;
        }
        // for(int i = start; i < candidates.length; i++) {
        //     current.add(candidates[i]);
        //     backtrack(candidates, target - candidates[i], i, current, result);//i ethukku kudukkuromna same value vaye again reuse panna 
        //     current.remove(current.size() - 1); // backtrack
        // }

        for(int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            target=target-candidates[i];
            backtrack(candidates, target , i, current, result);//i ethukku kudukkuromna same value vaye 
            target=target+candidates[i];
            current.remove(current.size() - 1); // backtrack
        }
    }
}
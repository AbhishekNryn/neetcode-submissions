class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        int len1 = nums.length;
        int len2 = set.size();

        if(len1 != len2) return true;

        return false;
    }
}
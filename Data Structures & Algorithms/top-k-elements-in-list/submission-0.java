class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> minh = new PriorityQueue<>((a,b) -> mp.get(a) - mp.get(b));

        for(int key : mp.keySet())
        {
            minh.offer(key);
            if(minh.size()>k){
                minh.poll();
            }
        }

        int[]res=new int[k];
        for(int i=k-1;i>=0;i--)
        {
            res[i]=minh.poll();
        }

        return res;
    }
}

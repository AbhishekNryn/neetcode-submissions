class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer>p=new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));

        for(int num:map.keySet())
        {
            p.offer(num);
            if(p.size()>k)
            {
                p.poll();
            }
        }

        int res[]=new int[k];

        for(int i=k-1;i>=0;i--)
        {
            res[i]=p.poll();
        }

        return res;
    }
}

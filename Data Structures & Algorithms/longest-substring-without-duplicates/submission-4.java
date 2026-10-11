class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi= 0;
        int count= 0;
        int left =0;

        if(s.length()==1) return 1;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxi = Math.max(maxi, i - left + 1);
        }

        return maxi;
    }
}

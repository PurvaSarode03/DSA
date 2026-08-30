 class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map= new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n=nums2.length;

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                map.put(nums2[i],stack.peek());
            }
            else{
                map.put(nums2[i],-1);
            }
            stack.push(nums2[i]);
        }
     
     int [] ans= new int[nums1.length];
     int n2=nums1.length;
     for(int i=0;i<n2;i++){
        ans[i]=map.get(nums1[i]);
     }
     return ans;
        
    }
}

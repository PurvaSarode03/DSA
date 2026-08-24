class Solution {
   public int maxDistance(int[] position, int m) {
   int n=position.length;
   Arrays.sort(position);
   int low=1;
   int high=position[n-1]-position[0];
    int ans=0;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(canReach(position,m,mid)){
            ans=mid;
            low=mid+1;
        }else{
            high=mid-1;
        }

    
    }
return ans;

}

private boolean canReach(int[] arr,int m,int mid){
    int count=1;
    int last=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]-last>=mid){
            count++;
            last=arr[i];
        }
    }
    return count>=m;
}
}
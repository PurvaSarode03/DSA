class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;

        int [] height= new int[col];
        int maxarea=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1'){
                    height[j]+=1;
                }else{
                    height[j]=0;
                }
            }
            maxarea=Math.max(maxarea,largestrectangle(height));
        }
        return maxarea;
    }

public int largestrectangle(int [] height){
    int n=height.length;
       int maxArea=0;
       Stack<Integer> st= new Stack<>();

       for(int i=0;i<=n;i++){
        int h=(i==n)?0:height[i];
        while(!st.isEmpty() && h<height[st.peek()]){
           int h2=height[st.pop()];
           int width=(st.isEmpty()?i:i-st.peek()-1);
            int area=h2*width;
            maxArea=Math.max(maxArea,area);
        }
          st.push(i);
       }
       return maxArea;
    
}
}
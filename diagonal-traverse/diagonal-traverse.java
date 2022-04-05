class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       if (mat.length==0||mat[0].length==0)return new int[0];
        int col=mat.length,row=mat[0].length;
        int nums=col*row,m=0,n=0;
        int res[]=new int[nums];
        boolean flag=true;

        for(int i=0;i<nums;i++){
            res[i]=mat[m][n];
            if(flag){
                n+=1; m-=1;
                
            }else{
                n-=1; m+=1;
            }
            if(m>=col){
                m-=1; n+=2; flag=true;
            }else if(n>=row){
                n-=1; m+=2; flag=false;
            }
            if(m<0){
                m=0; flag=false;
            }else if(n<0){
                n=0; flag=true;
            }
        }
        return res;
    }
}
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum=0;
        int max=0;
        int level=0;
        double x=A.length;
        for(int i=1;i<(int)Math.ceil(x/2);i++){
            double num=Math.pow(2,(double)i-1);
             for(int j=0;j<(int)num;j++){
                 int begin=(int)Math.pow(2,(double)i-1)-1;
                 sum=sum+A[begin+j];
                }//2nd for
             
                if(sum>max)
                {
                  max=sum;
                  level=i;
                }
        
                
            
        }//1st for
        
        return level;
    }
}

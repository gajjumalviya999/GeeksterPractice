package dp;
public class QueensAttack2 {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k,int r_q, int c_q, int[][] obstacles) {
        int d11,d12,d13,d14,u1,u2,l1,r1;
        int sum=0;
            d11=NW(n,r_q,c_q,k,obstacles);
            d12=NE(n,r_q,c_q,k,obstacles);
            d13=SE(n,r_q,c_q,k,obstacles);
            d14=SW(n,r_q,c_q,k,obstacles);
            u1=N(n,r_q,c_q,k,obstacles);
            u2=S(n,r_q,c_q,k,obstacles);
            l1=W(n,r_q,c_q,k,obstacles);
            r1=E(n,r_q,c_q,k,obstacles);
            sum+=d11+d12+d13+d14+u1+u2+l1+r1;
        return sum;
    }
   private static int NW(int n,int r_q,int c_q ,int k,int[][] obstacles){
       int count=0;
       int i=r_q-1,j=c_q-1;
       while(i>=1&&j>=1){
           for(int obs=0;obs<k;obs++){
               if(i==obstacles[obs][0]&&j==obstacles[obs][1])
                   return count;
           }
           count++;
           i--;
           j--;    
       }
       return count;
       
   }
        private static int NE(int n,int r_q,int c_q ,int k,int[][] obstacles){
            int count=0;
            int i=r_q-1,j=c_q+1;
            while(i>=1&&j<=n){
           for(int obs=0;obs<k;obs++){
               if(i==obstacles[obs][0]&&j==obstacles[obs][1])
                   return count;
           }
               count++;
               i--;
               j++;
           }
           
       
       return count;
       
   }
        private static int SE(int n,int r_q,int c_q ,int k,int[][] obstacles){
            int count=0;
       int i=r_q+1,j=c_q+1;
       while(i<=n&&j<=n){
           for(int obs=0;obs<k;obs++){
               if(i==obstacles[obs][0]&&j==obstacles[obs][1])
                   return count;
           }
               count++;
               i++;
               j++;
           
           
       }
       return count;
       
   }
        private static int SW(int n,int r_q,int c_q ,int k,int[][] obstacles){
            int count=0;
       int i=r_q+1,j=c_q-1;
       while(i<=n&&j>=1){
          for(int obs=0;obs<k;obs++){
               if(i==obstacles[obs][0]&&j==obstacles[obs][1])
                   return count;
           }
               count++;
               i++;
               j--;
        
           
       }
       return count;
       
   }
        private static int N(int n,int r_q,int c_q, int k,int[][] obstacles){
            int count=0;
       int i=r_q-1,j=c_q;
       while(i>=1){
          for(int obs=0;obs<k;obs++){
               if(i==obstacles[obs][0]&&j==obstacles[obs][1])
                   return count;
           }
               count++;
               i--;
           
           
       }
       return count;
       
   }
        private static int S(int n,int r_q,int c_q ,int k,int[][] obstacles){
               int count=0;
       int i=r_q-1,j=c_q;
       while(i<=n){
           for(int obs=0;obs<k;obs++){
               if(i==obstacles[obs][0]&&j==obstacles[obs][1])
                   return count;
           }
               count++;
               i++;
          
           
       }
       return count;
       
   }
        private static int E(int n,int r_q,int c_q, int k,int[][] obstacles){
          int count=0;
       int i=r_q,j=c_q+1;
       while(j<=n){
          for(int obs=0;obs<k;obs++){
               if(i==obstacles[obs][0]&&j==obstacles[obs][1])
                   return count;
           }
               count++;
               j++;
           
           
       }
       return count;
   }
        private static int W(int n,int r_q,int c_q ,int k,int[][] obstacles){
               int count=0;
       int i=r_q,j=c_q-1;
       while(j>=1){
          for(int obs=0;obs<k;obs++){
               if(i==obstacles[obs][0]&&j==obstacles[obs][1])
                   return count;
           }
               count++;
               j--;
          
           
       }
       return count;
       
   }
}

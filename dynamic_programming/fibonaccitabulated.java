package dynamic_programming;
import java.util.*;
public class fibonaccitabulated {
    static int fibo(int n) {
        int[] dp = new int[n + 1];

        // Storing the independent values in dp
        dp[0] = 0;
        dp[1] = 1;
        // Using the bottom-up approach
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
   //THIS IS WHAT WE ALREADY DID 
   //T.C=O(2**N) //SPACE COMPLEXITY=O(N)
   static int recursivefib(int n){
    if(n==0)return 0;if(n==1)return 1;
   return recursivefib(n-1)+recursivefib(n-2);}
//t.c=O(N) s.c=O(N)//due to dp array and also recursive stack space
//what we can do better? we can reduce recursive stack space i.e is what is called as tabulation
static int  memoizedfib(int n,int[] dp){
     if(dp[n]!=-1)return dp[n];//we have already calculated
    //top to down appraoch 
     dp[n]=memoizedfib(n-1,dp)+ memoizedfib(n-2,dp);
   return dp[n];}
//t.c=O(N)  //s.c=O(N) there is no recursion overhead so more space optimized
static int tabulation(int n,int[] dp){
   dp[0]=0;dp[1]=1; //base case 
 //bottom to up approach 
  for(int i=2;i<=n;i++){
   dp[i]=dp[i-1]+dp[i-2];}
   return dp[n];
}

    public static void main(String[] args) {
        int n = 9;
        int[] dp=new int[n+1];
         Arrays.fill(dp,-1);
        System.out.println(recursivefib(n));
         dp[0]=0;dp[1]=1;
        System.out.println(memoizedfib(n,dp));
        System.out.println(fibo(n));
        System.out.println(tabulation(n, dp));
    }
}

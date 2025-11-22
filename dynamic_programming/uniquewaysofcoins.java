package dynamic_programming;

import java.util.Scanner;

public class uniquewaysofcoins {
  

 public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
            int sum=input.nextInt();
            int length=input.nextInt();
            int[] coins=new int[length];
             for(int j=0;j<length;j++){
              coins[j]=input.nextInt();}
               int n=length;
              //let me just do this one 
              //dp[i][j] represents the no of ways to make that sum including or after the jth coins 
              int[][] dp=new int[sum+1][n+1];
                for(int i=0;i<=sum;i++){
                  dp[i][length]=0;
}
                 for(int i=0;i<n;i++){
               dp[0][i]=1;}
                 
               for(int i=1;i<=sum;i++){
              for(int j=n-1;j>=0;j--){
                              if(i>=coins[j]){
                           dp[i][j]+=dp[i-coins[j]][j];}
                            dp[i][j]+=dp[i][j+1];

                         }

        }
               System.out.println(dp[sum][0]);
                
 






 }

    
}

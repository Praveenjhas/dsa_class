package dynamic_programming;
import java.util.*;
public class waysofcoins {
    public static void main(String[] args) {
        //find out the state
         //dp state is nth fibnacci state
          //input
          Scanner input=new Scanner(System.in);
            int sum=input.nextInt();
            int length=input.nextInt();
            int[] coins=new int[length];
             for(int j=0;j<length;j++){
              coins[j]=input.nextInt();}
             //input
             int[] dp=new int[sum+1];
              dp[0]=1;
              //state is dp[n] which represents no of ways to make n using all coins 
             for(int i=0;i<=sum;i++){
                //how i can find dp[i]
                  for(int j=0;j<coins.length;j++){
                if(i>=coins[j]){
               dp[i]+=dp[i-coins[j]];}
                }
              }
              System.out.println(dp[sum]);
            //O(sum*length)
           //O(n);
            
           
    }
}

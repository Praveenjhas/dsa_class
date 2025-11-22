import java.util.*;
public class towerofhanoi {
   static void toh(int n,int start,int intermediate,int end){
    if(n==1){
    System.out.println(n+" "+start+" "+end);
     return ;}
   toh(n-1,start,end,intermediate);
   System.out.println(n+" "+start+" "+end);
   toh(n-1,intermediate,start,end);
}
  static long counter(int n,int start,int intermediate,int end){
   if(n==1)return 1;
   long first=counter(n-1,start,end,intermediate);
  long second=counter(n-1,intermediate,start,end);
         return first+1+second;
  }

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();  
   long  count=counter(n,1,3,2);
   // System.out.println(count);
   // toh(n,1,3,2);
    System.out.println("no of steps is " +count);
   input.close();
  }
}

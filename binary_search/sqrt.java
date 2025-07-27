package binary_search;
import java.util.*;
public class sqrt{

static boolean check(long mid,long n){
   if(mid*mid<=n){return true;}
     return false;
}
public static void main(String[] args) {
  
Scanner input=new Scanner(System.in);
long n=input.nextLong();
long l=1 ; long r=n;
long answer=-1;
while(l<=r){
long mid=l+((r-l)/2);
if(check(mid,n)){
    answer=mid;
   l=mid+1;
}
else{
 r=mid-1;
}

}
System.out.println(answer);
   
}








}
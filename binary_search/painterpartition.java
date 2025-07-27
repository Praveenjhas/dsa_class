package binary_search;
import java.util.*;
public class painterpartition {
     static boolean check(int mid,int n,int[] arr,int k){
                  int sum=0;
                  int first=0;
                 int norequired=0;
                while(first<n){
                     sum+=arr[first];
                  if(sum<=mid){
                  first++;}
                  else{
                    norequired++;
                    sum=arr[first];
                      first++;
                 }
                  }
                if(sum!=0){norequired++;}
               if(norequired>k)return false;
                return true;


           }
 public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
     int n=input.nextInt();
    int k=input.nextInt();
    int[] arr=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
      arr[i]=input.nextInt();
          sum+=arr[i];
   }
  
int l=1 ; int  r=sum;
int answer=-1;
while(l<=r){
int  mid=l+((r-l)/2);
if(check(mid,n,arr,k)){
    answer=mid;
     r=mid-1;
}
else{
   l=mid+1;
}

}
System.out.println(answer);
     
 }
    
}

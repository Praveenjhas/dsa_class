import java.util.*;
public class towerofhanoi {
  
  static void toh(int size,int start,int intermediate,int end){
          if(size==1){
            System.out.println(1+" "+start+" "+end);
            return;}
         toh(size-1,start,end,intermediate);
         System.out.println(size+" "+start+" "+end);
         toh(size-1,intermediate,start,end);
  }
  static int counter(int size,int start,int intermediate,int end){
    if(size==1){
      return 1;
    }
      
   int value1=counter(size-1,start,end,intermediate);
   int value2=counter(size-1,intermediate,start,end);
   return value1+value2+1;
  }
  
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int count=counter(n,1,3,2);
    System.out.println(count);
    toh(n,1,3,2);
   input.close();
  

  }
}

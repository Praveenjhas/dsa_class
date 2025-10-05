public class maxmin {
  
      static int maxvalue(int[] arr,int index){
        if(index==0)return arr[index];//base case
       return Math.max(maxvalue(arr,index-1),arr[index]);//recursive condition
}
    static int minvalue(int[] arr,int index){
        if(index==0)return arr[index];
       return Math.min(minvalue(arr,index-1),arr[index]);
}
   
public static void main(String[] args) {
     int[] arr={1,-200,23,400,-49,29};
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
          max=Math.max(max,arr[i]); 
          min=Math.min(min,arr[i]);
    }
     System.out.println(max+" "+min);//iterative approach 
      //recursive approach 
         int n=arr.length;
      System.out.println(maxvalue(arr,n-1)+" max value");
      System.out.println(minvalue(arr,n-1)+" min value");
  


}

}
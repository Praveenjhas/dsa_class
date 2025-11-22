import java.util.*;
public class subsequence {
    static void Subsequence(String st,List<String> list,int i){
   if(i==0){
     list.add(st.charAt(i)+"");
      list.add("");
     return ;
}
      Subsequence(st, list, i-1);
    int size=list.size();           //extra work
    for(int j=0;j<size;j++){
       list.add(list.get(j)+st.charAt(i));
  }
   
}
   
 public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
     String st=input.next();
     List<String> list=new ArrayList<>();
   Subsequence(st,list,st.length()-1);
   System.out.println(list);
    
 }
    
}

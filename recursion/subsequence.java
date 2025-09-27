import java.util.*;
public class subsequence {
   static void subsequnce(String s,int i,List<String> list){
      if(i==0){
        list.add(s.charAt(i)+"");
        list.add("");
        return ;
    }
     subsequnce(s, i-1, list);
     int size=list.size();
     for(int j=0;j<size;j++){
      list.add(list.get(j)+s.charAt(i));

   }
   }
 public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String st=input.next();
    List<String> list=new ArrayList<>();
    subsequnce(st,st.length()-1,list);
    System.out.println(list);
    
 }
    
}

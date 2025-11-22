import java.util.*;
public class permutation {

     static void permute(String s,String st){
        if(s.isEmpty()){
       System.out.println(st);
       return;}
        for(int i=0;i<s.length();i++){
           permute(s.substring(0,i)+s.substring(i+1,s.length()),st+s.charAt(i));
    }
   }
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String s=input.next();
    char[] chararray=s.toCharArray();
    Arrays.sort(chararray);
    String str="";
    for(int i=0;i<s.length();i++){
            str+=chararray[i]; }    //to maintain the lexographical order means from a to b to c it mean sorted order
    permute(str,"");

}
    
}

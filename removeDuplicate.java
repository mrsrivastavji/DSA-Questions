import java.util.*;

public class main{
    public static boolean[] map=new boolean[26];
    
    public static void remove(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        
        char curr=str.charAt(idx);
        if(map[curr-'a']){
            remove(str,idx+1,newstr);
        }
        else{
            newstr+=curr;
            map[curr-'a']=true;
            remove(str,idx+1,newstr);
        }
    }
    
    public static void main(String args[]){
        String str="abbcccdddde";
        remove(str,0,"");
    }
}

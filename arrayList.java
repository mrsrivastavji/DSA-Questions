 import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;

class ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        
        int element = list.get(0);
        System.out.println(element);
        
        list.add(0,5);
        System.out.println(list);
        
        list.set(0,0);
        list.set(1,4);
        list.set(2,2);
        list.set(3,1);
        list.set(4,3);
        list.set(5,5);
        System.out.println(list);
        
        list.remove(5);
        System.out.println(list);
        
        int len = list.size();
        System.out.println(len);
        
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        Collections.sort(list);
        System.out.println(list);
        
    }
}

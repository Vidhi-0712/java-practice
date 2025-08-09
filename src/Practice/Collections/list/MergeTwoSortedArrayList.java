package Practice.Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeTwoSortedArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> List2 = new ArrayList<>(Arrays.asList(2,4,6));

        List1.addAll(List2);
        Collections.sort(List1);
        System.out.println(List1);

//        int m = List1.size();
//        int n = List2.size();
//
//        int p1=0;
//        int p2=0;
//
//        ArrayList<Integer> Listfinal = new ArrayList<>(m+n);
//        while(p1<m && p2<n){
//            if(List1.get(p1).equals(List2.get(p2))){
//                Listfinal.add(List1.get(p1));
//                Listfinal.add(List2.get(p2));
//                p1++;
//                p2++;
//            } else if (List1.get(p1)>List2.get(p2)){
//                Listfinal.add(List1.get(p1));
//                p1++;
//            } else{
//                Listfinal.add(List2.get(p2));
//                p2++;
//            }
//            while (p1 < m) {
//                Listfinal.add(List1.get(p1));
//                p1++;
//            }
//
//            // Add remaining elements from List2
//            while (p2 < n) {
//                Listfinal.add(List2.get(p2));
//                p2++;
//            }
//        }
//        Collections.sort(Listfinal);
//        System.out.println(Listfinal);
    }
}

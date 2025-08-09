package Practice.Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.LinkedList;

public class MergeTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,8,2,4,5));

        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(3,6,7,8,9));

        l1.addAll(l2);
        System.out.println(l1);
        Collections.sort(l1);
    }
}

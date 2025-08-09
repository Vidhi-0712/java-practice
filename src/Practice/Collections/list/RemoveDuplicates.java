package Practice.Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Mango", "Banana", "Orange"));

        for (int i = 0; i<fruits.size(); i++) {
            for (int j =i+1; j<fruits.size(); j++){
                if (fruits.get(i).equals(fruits.get(j))) {
                    fruits.remove(j);
                    j--;
                }
            }
        }
        System.out.println(fruits);

        //using for each loop
        ArrayList<String> uniq = new ArrayList<>();
        for(String it : fruits){
            if(!uniq.contains(it)){
                uniq.add(it);
            }
        }
        System.out.println(uniq);

       // using iterator
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            }

        }
    }



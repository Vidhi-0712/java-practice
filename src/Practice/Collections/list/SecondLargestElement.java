package Practice.Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(12, 35, 1, 10, 34, 1));
        int largest = Collections.max(elements);
        System.out.println("The largest element in the list is :" + largest);

        Collections.sort(elements);
        int secondLargest=Integer.MAX_VALUE;
        for (int i = elements.size()-1; i >= 0; i--) {
            if (elements.get(i) < largest) {
                 secondLargest = elements.get(i);
                 break;
            }
        }
        System.out.println("The Second Largest element is : "+secondLargest);
    }
}

package Practice.Collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAnArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            temp.add(numbers.get(i));
        }
        System.out.println(temp);
    }
}

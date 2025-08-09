package Practice.Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfElement {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,3,1,4,2));

        Collections.sort(nums);
        System.out.println(nums);

        int count =1;
        for(int i=0; i<nums.size(); i++){

                    if (i<nums.size()-1 && nums.get(i).equals(nums.get(i+1))) {
                        count++;

                    }
                    else{
                        System.out.println(nums.get(i) + "=>" + count);
                        count=1;
                    }
                    ;
                }

        }
    }

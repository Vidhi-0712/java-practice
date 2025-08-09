package Practice.Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotateAnArrayListByKPositions {
    public static void main(String[] args) {
        ArrayList<Integer> rotate = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        k=k%rotate.size();

        Collections.rotate(rotate,k);

        System.out.println(rotate);
    }
}

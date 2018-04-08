
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sv186040
 */
public class DistinctPairSum {

    public static int getDistinctPairSum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int y = k - arr[i];
            if (!map.containsKey(y)) {
                map.put(arr[i], y);
            } else {
                int z = map.get(y);
                map.put(z, -1);
                if (y + z == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getDistinctPairSum(new int[]{1, 46, 1, 21, 26, 21}, 47));
    }
}

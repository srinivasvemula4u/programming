
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author srivemul
 */
public class FractionalKnapsack {

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here
        double[] valueByWeightMatrix = new double[values.length];
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        int length = weights.length;
        for (int i = 0; i < length; i++) {
            valueByWeightMatrix[i] = (values[i] * 1.0) / weights[i];
            map.put(valueByWeightMatrix[i], weights[i]);
        }
        Arrays.sort(valueByWeightMatrix);
        int len = valueByWeightMatrix.length;
        for (int i = 0; i < length; i++) {
            if (capacity == 0) {
                return value;
            }
            int weight = map.get(valueByWeightMatrix[len - 1 - i]);
            int margin = weight < capacity ? weight : capacity;
            value = value + margin * (valueByWeightMatrix[len - 1 - i]);
            // weights[i] -= margin;
            capacity -= margin;

        }
        //DecimalFormat df = new DecimalFormat("#.####");
        value = Double.parseDouble(new DecimalFormat("#.####").format(value));
        // value = Double.parseDouble(df.format(value));
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
}

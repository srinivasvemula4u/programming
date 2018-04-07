/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
public class FindMaxMinUsingMinimumComparsions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        getMinMax(arr);
        Pair pair = getMinMax(arr, 0, arr.length - 1);
        System.out.println(pair.min + " " + pair.max);
        getMinMaxInPairs(arr);

    }

    private static void getMinMax(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            System.out.println(arr[0] + " " + arr[0]);
            return;
        } else if (n == 2) {
            if (arr[0] >= arr[1]) {
                System.out.println(arr[1] + " " + arr[0]);
            } else {
                System.out.println(arr[0] + " " + arr[1]);
            }
            return;
        }
        int min = arr[0], max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);

    }

    private static class Pair {

        int min;
        int max;
    }

    private static Pair getMinMax(int[] arr, int low, int high) {
        Pair minMax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        if (low == high) {
            minMax.min = arr[low];
            minMax.max = arr[low];
            return minMax;
        }
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minMax.min = arr[high];
                minMax.max = arr[low];
            } else {
                minMax.min = arr[low];
                minMax.max = arr[high];
            }
            return minMax;
        }
        int mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid + 1, high);
        if (mml.min < mmr.min) {
            minMax.min = mml.min;
        } else {
            minMax.min = mmr.min;
        }
        return minMax;
    }

    private static void getMinMaxInPairs(int[] arr) {
        int len = arr.length;
        int i = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        if (len % 2 == 0) {
            if (arr[0] >= arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                max = arr[1];
                min = arr[0];
            }
            i = 2;
        } else {
            max = min = arr[0];
            i = 1;
        }
        while (i < len - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) {
                    max = arr[i];
                } else if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                } else if (arr[i] < min) {
                    min = arr[i];
                }
            }
            i += 2;
        }
        System.out.println(min + " " + max);
    }

}

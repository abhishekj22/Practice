package prac.java;

import java.util.Arrays;
import java.util.HashMap;

/**
 * from given array find two number which sum is given number 
 * ip = [3, 5, -4, 8, 11, 1, -1, -6], 10
 * op = [11, -1]
 */
public class TwoNumberSum{
    public static void main(String[] args) {
        //int arr[] = {7, 11, 15, 1, -1, -6, 33, 2};
        int arr[] = {3, 5, -4, 8, 11, 1, -1, -6};
        int num = 10;
        findNumSol1(arr, num);
        findNumSol2(arr, num);
        findNumSol3(arr, num);
    }

    /**
     * solution 1: iterate twice and check if addition is equal to sum
     * time complexity O(n) || space O(1)
     */
    public static void findNumSol1(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for(int j = i+1; j < arr.length; j++){
                int y = arr[j];
                if((x + y) == sum){
                    System.out.println("[" + x + ", " + y + "]");
                    return;
                }
            }
        }
    }

    /**
     * solution 2: as wee know x + y = sum, then sum - x = y
     * iterate over array while iterating check if sum - current array element 
     * check if it is present in hashmap if no add it if yes it's the result
     * time complexity = O(n) || space O(n)
     */
    public static void findNumSol2(int arr[], int sum) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int y = (sum - x);
            if(hm.get(y) != null){
                System.out.println("[" + x + ", " + y + "]");
                return;
            } else
                hm.put(x, Boolean.TRUE);
        }
    }

    /**
     * solution 3: sort the array
     * while iteratinig over sorted array take two pointers which points to 
     * left most element L and right most elements R
     * if addition of this two L + R is lower than sum then L will point to next element
     * if addition of this two L + R is grater than sum then R will point to previous element
     * time complexity = O(n log n) [because of sorting] || space O(1)
     */
    public static void findNumSol3(int arr[], int sum) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        int l = arr[i];
        int r = arr[j];

        while(l < r){
            int z = l + r;
            if(z == sum){
                System.out.println("[" + l + ", " + r + "]");
                return;
            }else if(z < sum){
                l = arr[++i];
            }else if(z > sum){
                r = arr[--j];
            }
        }
    }
}
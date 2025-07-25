/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class V2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Array 1:");
        String array1 = sc.nextLine();
        
        System.out.print("Array 2:");
        String array2 = sc.nextLine();
        
        // Parse array
        int[] arr1 = parseArray(array1);
        int[] arr2 = parseArray(array2);
        
        // Merge array
        int[] arr = mergeArray(arr1, arr2);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s%d%s", (i == 0) ? "[" : "", arr[i], (i != arr.length-1) ? ",":"]\n");
        }
        
        sc.close();
    }
    
    public static int[] parseArray(String array){
        String[] numbers = array.split(",");
        int[] arr = new int[numbers.length];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        
        return arr;
    }
    // Learn System.arraycopy for copying data from one array to aanother
    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        
        // Manually copy elements from array1 and array2 to merged
//        for (int i = 0; i < arr1.length; i++) {
//            merged[i] = arr1[i];
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            merged[arr1.length + i] = arr2[i];
//        }

        
        // Bubble sort order by ASC
        for (int i = 0; i < merged.length; i++) {
            for (int j = 0; j < merged.length-i-1; j++) {
                if (merged[j] > merged[j+1]) {
                    int temp = merged[j];
                    merged[j] = merged[j+1];
                    merged[j+1] = temp;
                }
            }
        }
        
        int uniqueCount = 0;
        for (int i = 0; i < merged.length; i++) {
            /*
                i == 0: The first element is always unique (no previous element to compare with).
                merged[i] != merged[i - 1]: If the current element is different from the previous one, it's unique.
            */
            if (i == 0 || merged[i] != merged[i - 1]) {
                merged[uniqueCount++] = merged[i];
            }
        }
        
        int[] arr = new int[uniqueCount];
        System.arraycopy(merged, 0, arr, 0, uniqueCount);
        
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = merged[i];
//        }
        
        return arr;
    }
}

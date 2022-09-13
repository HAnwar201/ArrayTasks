package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task1 {
    int[] og = {3,5,4,6};
    public int[] sortA(int[] toSort, int insert){
        final int N = toSort.length;
        toSort = Arrays.copyOf(toSort, N + 1);
        toSort[N] = insert;

        Arrays.sort(toSort);
        System.out.println(Arrays.toString(toSort));


        return toSort;
    }
    public int[] sortB(int[] toSort, int insert){

        ArrayList<Integer> newSort = new ArrayList<Integer>(Arrays.stream(toSort).boxed().toList());
        newSort.add(insert);
        Collections.sort(newSort);
        int[] sorted = newSort.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(sorted));
        return sorted;
    }

    public int[] merge(int[] sortA, int[] sortB){
        int fisrtN = sortA.length;        //determines length of firstArray
        int secondN = sortB.length;
        int[] result = new int[fisrtN + secondN];
        System.arraycopy(sortA, 0, result, 0, fisrtN);
        System.arraycopy(sortB, 0, result, fisrtN, secondN);


        Arrays.sort(result);
        int n = result.length;
        removeDuplicateElements(result,n);

        System.out.println(Arrays.toString(result));
        return result;
    }
    public int[] removeDuplicateElements(int[] arr, int n){
        if (n==0 || n==1){
            return null;
        }
        int j = 0;//for next element
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

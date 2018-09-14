package com.code;

public class FindLargestNumberAfterKSwap {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 0, 6, 6};
        int k = 3;
        kSwapPermutation(arr, arr.length, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void kSwapPermutation(int arr[], int n, int k) {
        int pos[] = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            pos[arr[i]] = i;
        }
        for (int i = 0; i < n && k > 0; ++i) {
            if (arr[i] == n - i) continue;
            int temp = pos[n - i];
            pos[arr[i]] = pos[n - i];
            pos[n - i] = i;
            int tmp1 = arr[temp];
            arr[temp] = arr[i];
            arr[i] = tmp1;
            --k;
        }
    }
}

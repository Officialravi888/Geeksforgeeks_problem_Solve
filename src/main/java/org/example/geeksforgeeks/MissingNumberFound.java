package org.example.geeksforgeeks;
//        Input:
//        N = 5
//        A[] = {1,2,4}
//        Output: 3
public class MissingNumberFound {
    public static int getMessage(int []nums, int n) {
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4};
        int n=arr.length;
        System.out.println(getMessage(arr,n));
    }

}

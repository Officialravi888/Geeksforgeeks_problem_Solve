package org.example.geeksforgeeks;
//        Input:
//        N = 5
//        A[] = {1,2,3,5}
//        Output: 4
public class MissingNumber {
    public static void findMissing(int arr[], int n){
        int temp[]=new int [n+1];
        for (int i=0; i<n; i++){
            temp[i]=0;
        }
        for (int i=0; i<n; i++){
            temp[arr[i]-1]=1;
        }
        int ans=0;
        for (int i=0; i<n; i++){
            if(temp[i]==0)
                ans=i+1;
        }
        System.out.println("find no:"+ans);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int n= arr.length;
        findMissing(arr,n);
    }

}

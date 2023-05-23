package org.example.geeksforgeeks;

import java.util.ArrayList;

//        Input:
//        N = 5, S = 12
//        A[] = {1,2,3,7,5}
//        Output: 1:3
//        Explanation: The sum of elements
//        from 1nd position to 3th position
//        is 12.
public class Solution1 {
  void subArraySum(int arr[], int n , int sum){
      for (int i=1; i<n; i++){
          int currentSum=arr[i];
          if (currentSum==sum){
              System.out.println("Sum found at index:"+i);
              return;
          }
          else {
              for (int j=i+1; j<n; j++){
                  currentSum+=arr[j];
                  if (currentSum==sum){
                      System.out.println("Sum found between indexes "+i+":"+j);
                      return;
                  }
              }
          }
      }
      System.out.println("Number sub array found");
      return;
  }

    public static void main(String[] args) {
      Solution1 obj=new Solution1();
      int arr[]={1,2,3,7,5};
      int n=arr.length;
      int sum=12;
      obj.subArraySum(arr,n,sum);
    }
}

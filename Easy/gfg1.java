// Missing in Array

// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/0


class Solution {
    int missingNum(int arr[]) {   // O(n)  0(1)
        // code here
        int n = arr.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i =0; i<n;i++){
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i+1);
        }
        xor2 = xor2^(n+1);
        return xor1^xor2;
    }
}
class Solution {
    public int smallestDivisor(int[] arr, int t) {
        //apply bs on ans not on arr
        //if we div max ele of arr with arr ele we get ans as arr.length
        // max limit of divisor is max ele of arr.
         int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>=mx) mx = arr[i];
        }
        int d;
        for( d = 1;d<=mx;d++){
            int sum = 0;
            for(int i =0;i<n;i++){
                if(arr[i]%d==0) sum += arr[i]/d;
                else sum += arr[i]/d + 1;           
            }
            if(sum<=t) return d;
        }
     return d;
    }
}
package LeetCode;

import java.util.Arrays;

public class LeetCode198DP {
    public int rob(int [] nums){

        int []dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];


        for (int i = 2; i <nums.length ; i++) {

            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);

        }
        return dp[nums.length-1];
    }

    public void Swap(int []A,int a,int b){
        int temp;
        temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
    public int[] sortArrayByParity(int[] A) {

        int i=0;
        int j=A.length-1;

        while (i<j){
            while (A[i]%2==0 && i<j) i++; //i指向奇数
            while (A[j]%2!=0 && i<j) j--;  // j指向偶数
            if(i<j)      Swap(A,i,j);

        }

        return A;

    }

    public int partitionDisjoint(int[] A) {


        for (int i = 0; i <A.length ; i++) {
            int j=0;
            int k=i+1;
            int leftmax=0;
            int rightmin=A.length-1;
            while (j<=i){
                if (A[j]>A[leftmax]) leftmax=j;
                j+=1;
            }
            while (k<A.length){
                if (A[k]<A[rightmin]) rightmin=k;
                k+=1;
            }
            if (A[leftmax]<=A[rightmin])
            {
                return i+1;
            }

        }

        return 0;



    }

    public static void main(String[] args) {
        LeetCode198DP leetCode198DP=new LeetCode198DP();
        int []nums={5,0,3,8,6};
        //System.out.println(leetCode198DP.rob(nums));
//        System.out.println(leetCode198DP.sortArrayByParity(nums).toString());
//        for (int num : nums) {
//            System.out.println(num);
//        }

        System.out.println(leetCode198DP.partitionDisjoint(nums));



    }
}

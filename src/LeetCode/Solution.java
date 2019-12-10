package LeetCode;

public class Solution {

    public static int removeDuplicates(int[] nums){
        //int length=nums.length;

        int i=0;
        int break_length=0;
        int index=0;

        while (i<nums.length){

            nums[index]=nums[i];
            int j=i+1;
            if (j==nums.length) break;
            while (j<nums.length && nums[j]==nums[i] ) {
                j+=1;
                break_length+=1;
            }
            i=j;
            index+=1;



        }
        return nums.length-break_length;

    }
    public int removeDuplicates2(int []nums){
        int len=0;
        boolean flag=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[len] && flag){
                continue;
            }
            else{
                if (nums[i]!=nums[len]){
                    nums[++len]=nums[i];
                    flag=false;
                }
                else{
                    nums[++len]=nums[i];
                    flag=true;
                }

            }
        }
        return len;
    }

    public static int rob(int[] nums) {

        int income1=0;
        int income2=0;

        for (int i=0;i<nums.length;i++){
            if (i%2==0)
            {
                income1+=nums[i];
            }
            else
            {
                income2+=nums[i];
            }
        }

        int result= income1>income2? income1:income2;
        return result;


    }

    public static void main(String[] args) {
        int []nums={1,1};
        int result = removeDuplicates(nums);
        System.out.println(result);

        int []nums2={2,1,1,2};
        System.out.println();

        System.out.println(rob(nums2));

    }
}

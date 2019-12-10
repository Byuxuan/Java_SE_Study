package day15;

public class TestVarargs {
    private static int sum(int ... nums){
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sum(1, 2);
        System.out.println(result);

        int result2 = sum(new int[]{1, 2, 3, 4, 5});
        System.out.println(result2);
    }
}

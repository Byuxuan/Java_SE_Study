package day7;
import day6.SortTest;

public class ArraySearchTest {

    public static int binarySearch(int []array,int value){
        int left=0,right=array.length-1;


        while (left<right){
            int mid=(left+right)/2;
            if (value==array[mid]) return mid;
            else if (value>array[mid]){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[]args){
        int []array=new int[]{1,5,6,7,10,3,9};
        int value=9;
        SortTest.Qsort(array,0,array.length-1);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        System.out.println(binarySearch(array,6));
        System.out.println(binarySearch(array,4));







    }
}

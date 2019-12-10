package day6;

public class SortTest {

    public static void Swap(int []array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void BubbleSort(int []array){


        for(int i=0;i<array.length;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }

            }
            Swap(array,i,min);
        }
    }



    public static void Qsort(int []array,int left,int right){

        if (left>right){
            return;
        }
        int index=Partitial(array,left,right);
        Qsort(array,left,index-1);
        Qsort(array,index+1,right);


    }
    public static int  Partitial(int []array,int left,int right){
        int i=left+1,j=right;

        while (i<j){

            while (i<=j && array[i]<=array[left]){
                i++;
            }
            while (i<=j && array[j]>=array[left]){
                j--;
            }
            if(i<j){
                Swap(array,i,j);
            }
        }
        if (array[left]>array[j])  Swap(array,left,j);
        return j;
    }


    public static void main(String []args){

        SortTest sort=new SortTest();

        int []array={1,3,5,7,9,2,3,4,7,8,-3,-1};
        BubbleSort(array);

        sort.BubbleSort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        int []array2={1,2,7,9,3,6,5,10,-3,-1};
        Qsort(array2,0,array2.length-1);
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }

    }


}

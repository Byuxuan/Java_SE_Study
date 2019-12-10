package day14;



public class SimpleCollection<T> {
    private T[] objArr;
    private int index=0;

    public SimpleCollection() {
        objArr=(T[]) new Object[10];

    }
    public SimpleCollection(int capacity){
        objArr = (T[]) new Object[capacity];
    }
    public void add(T t){
        objArr[index]=t;
        index+=1;
    }
    public int getLenth(){
        return this.index;
    }
    public T get(int i){
        return objArr[i];
    }

    public static void main(String[] args) {
        SimpleCollection<Integer> simpleCollection = new SimpleCollection<Integer>();
        for (int i = 0; i <10 ; i++) {
            simpleCollection.add(new Integer(i));
        }

    }
}

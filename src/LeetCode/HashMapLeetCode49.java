package LeetCode;

import java.util.*;


public class HashMapLeetCode49 {

    public static  int leastBricks(ArrayList < ArrayList < Integer >> wall) {
        HashMap < Integer, Integer > map = new HashMap < > ();
        for (List < Integer > row: wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                if (map.containsKey(sum))
                    map.put(sum, map.get(sum) + 1);
                else
                    map.put(sum, 1);
            }
        }
        int res = wall.size();
        for (int key: map.keySet())
            res = Math.min(res, wall.size() - map.get(key));
        return res;
    }


    public boolean canConstruct(String ransomNote, String magazine) {


        int []eleph=new int[26];
        int length=ransomNote.length();
        for(int i=0;i<magazine.length();i++){
            eleph[magazine.charAt(i)-'a']++;
        }

        for (int i = 0; i <ransomNote.length() ; i++) {
            int index=ransomNote.charAt(i)-'a';
            eleph[index]--;
            length--;
            if (length == 0) {
                return true;
            }
        }
        return false;



    }
    public static List<List<String>> groupAnagrams(String []args){
        int [] prime = Prime();

        //System.out.println(prime);

        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        List<List<String>> lists=new ArrayList<List<String>>();

        for (String arg : args) {
            int product=1;
            for (int i = 0; i <arg.length() ; i++) {
                product = product * prime[arg.charAt(i) - 'a'];

            }

            if(map.get(product)==null){
                List<String> stringList = new ArrayList<String>();
                stringList.add(arg);
                map.put(product, stringList);
            }
            else {
                map.get(product).add(arg);
            }

        }

        Set<Map.Entry<Integer,List<String>>> entry=map.entrySet();
        for (Map.Entry<Integer, List<String>> integerListEntry : entry) {
            List<String> value=integerListEntry.getValue();
            lists.add(value);
        }
        return lists;

    }

    public static int [] Prime(){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 2; i <200 ; i++) {
            boolean flag=false;
            for (int j = 2; j < i>>1 ; j++) {
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if (flag==false){
                arrayList.add(i);
            }
        }
        Integer []prime_=arrayList.toArray(new Integer[arrayList.size()]);
        int []prime=new int[arrayList.size()];
        for (int i = 0; i <arrayList.size() ; i++) {
            prime[i] = prime_[i];
        }
        return  prime;
    }

    public static void main(String[] args) {

        String[] strings = {"nozzle", "punjabi", "waterlogged", "imprison", "crux", "numismatists",
                "sultans", "rambles", "deprecating", "aware", "outfield", "marlborough", "guardrooms",
        };
        List<List<String>> lists = HashMapLeetCode49.groupAnagrams(strings);

        for (List<String> list : lists) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println("______________");
        }


        System.out.println("---------------------");


        ArrayList<ArrayList<Integer>> wall=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(2);
        arrayList1.add(1);
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList3.add(1);
        arrayList3.add(3);
        arrayList3.add(2);
        wall.add(arrayList1);
        wall.add(arrayList2);
        wall.add(arrayList3);


        System.out.println(leastBricks(wall));

    }


}



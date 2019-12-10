package day15;

import java.util.*;

enum FontConstant{
    Plain,Bold,Italic,Hello;
}

public class EnumSetdemo {
    public static void showEnumSet(EnumSet<FontConstant> enumSet){
        for (Iterator<FontConstant> iterator=enumSet.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }

    public static void showEnumSet2(EnumSet<FontConstant> enumSet){
        for (Iterator<FontConstant> iterator=enumSet.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Bold,FontConstant.Plain);
        enumSet.remove(FontConstant.Bold);
        showEnumSet(enumSet);

        System.out.println("---------");

        showEnumSet(EnumSet.complementOf(enumSet));

        System.out.println("----------------");


        EnumSet<FontConstant> enumSet1=EnumSet.noneOf(FontConstant.class);
        enumSet1.add(FontConstant.Bold);
        enumSet1.add(FontConstant.Plain);

        System.out.println("-----------------");

        List<FontConstant> list = new ArrayList<FontConstant>();

        list.add(FontConstant.Plain);
        list.add(FontConstant.Bold);

        showEnumSet(EnumSet.copyOf(list));

        System.out.println("--------------");

        Map<OpConstant, String> map = new EnumMap<OpConstant, String>(OpConstant.class);


        map.put(OpConstant.SHOOT, "射击");
        map.put(OpConstant.TURN_LEFT, "左转");
        map.put(OpConstant.TURN_RIGHT, "右转");

        for(OpConstant constant:OpConstant.values()){
            System.out.println(map.get(constant));
        }




    }
}

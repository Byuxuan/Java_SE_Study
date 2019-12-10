package day15;

public class ShowEnum {

    public static void enumComepareTo(OpConstant constant){
        System.out.println(constant);
        for (OpConstant c:OpConstant.values()){
            System.out.println(constant.compareTo(c)); //返回位置差
        }

        for(OpConstant c:OpConstant.values()){
            System.out.printf("%d, %s, %n",c.ordinal(),c);
        }
    }

    public static void main(String[] args) {
        enumComepareTo(OpConstant.valueOf("SHOOT"));
    }
}

package day15;

public class EnumTest {

    public static void doOp(OpConstant opConstant){
        switch (opConstant){  //char byte int enum
            case SHOOT:
                System.out.println("射击");
                break;
            case TURN_LEFT:
                System.out.println("左转");
                break;
            case TURN_RIGHT:
                System.out.println("右转");
                break;
        }
    }
    public static void main(String[] args) {
        Color myColor=Color.Blue;

        System.out.println("---------");

        for(Color color:Color.values()){
            System.out.println(color);
        }

        doOp(OpConstant.SHOOT);


    }
}


enum Color{
    Red,White,Blue
}

enum  OpConstant{
    TURN_LEFT,TURN_RIGHT, SHOOT
}
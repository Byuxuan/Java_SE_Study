package day16;

enum  Accee {
    MANAGEER,DEPARTMENT,ENPOLYEE,
}

public class AcceeRight{
    public static boolean checkRight(Accee accee){
        if(accee==Accee.MANAGEER) return true;
        else return false;
    }

    public static void main(String[] args) {
        Accee accee=Accee.MANAGEER;
        System.out.println(checkRight(accee));
    }
}


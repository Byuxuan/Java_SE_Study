package day7;

public class Authorization2 {
    public boolean canAccess(int access){
        if(access==Authorization.MANAGER){
            return true;
        }
        if(access==Authorization.DEPARMENT){
            return false;
        }
        if(access==Authorization.EMPLOEE){
            return false;
        }
        return false;
    }

}

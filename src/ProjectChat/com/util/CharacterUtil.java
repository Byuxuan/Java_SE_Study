package ProjectChat.com.util;

public class CharacterUtil {

    public static boolean isEmpty(String string) {
        if ("".equals(string)) {
            return true;
        }
        return false;
    }

    public static boolean isNumber(String string) {
        for (int i = 0; i <string.length() ; i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return  false;
            }
        }
        return true;
    }

    public static boolean isPortCorrect(String string) {

        int temp = Integer.parseInt(string);

        if (temp <= 1024 || temp > 65535) {
            return false;
        }
        else{
            return true;
        }
    }
}

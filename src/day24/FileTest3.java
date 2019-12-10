package day24;

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) {
        File file = new File("E:/LeetCode");

        String []names=file.list();

        for (String name:names){
            /**
             * 以 .java结尾的文件
             */
            if (name.endsWith(".java")) {
                System.out.println(name);
            }
        }
    }
}

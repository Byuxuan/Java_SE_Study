package day24;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest4 {
    public static void main(String[] args) {
        File file = new File("E:/圣思源");

        /**
         * 策略模式的一个实现，根据我们的需求实现具体的操作
         */
        String []names=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".wmv")) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        for (String name : names) {
            System.out.println(name);
        }
    }
}

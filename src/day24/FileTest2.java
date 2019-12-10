package day24;

import java.io.File;

public class FileTest2 {
    public static void main(String[] args) {
        File file = new File("E:/abc/xyz");
        System.out.println(file.mkdir());

        System.out.println(file.isDirectory());

        File file2 = new File("E:/LeetCode");
        /**
         * list 只打印第一层的文件夹和文件
         */
        String []names=file2.list();
        for (String name : names) {
            System.out.println(name);
        }

        File[] files = file2.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
            System.out.println(file1.getParent());
        }

        file.delete();


    }
}

package day24.homework;

import java.io.File;
import java.util.ArrayList;

public class FileListAll {
    private static int time;//判断目录或文件处于层次

    public static void deepList(File file) {
        if (file.isFile() || file.list().length == 0) {
            return;
        }
        else {
            File []files=file.listFiles();
            files = sort(files);

            for (File fi : files) {
                StringBuffer out=new StringBuffer();
                if (fi.isFile()) {
                    out.append(getTabs(time));
                    out.append(fi.getName());
                }
                else {
                    out.append(getTabs(time));
                    out.append(fi.getName());
                    out.append("\\");
                }
                System.out.println(out);
                if (fi.isDirectory()) {
                    time++;
                    deepList(fi);
                    time--;
                }
            }
        }
    }

    /**
     * 整理文件数组，使得目录排在文件之前
     */
    private static File[] sort(File[] files) {
        ArrayList<File> sorted = new ArrayList<File>();
        for (File f : files) {
            if (f.isDirectory()) {
                sorted.add(f);
            }
        }
        for (File f : files) {
            if (f.isFile()) {
                sorted.add(f);
            }
        }
        return sorted.toArray(new File[files.length]);
    }

    public static String getTabs(int time) {
        StringBuffer buffer=new StringBuffer();
        for (int i = 0; i <time ; i++) {
            buffer.append("\t\t");
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        File file = new File("E:/LeetCode/小象学院LeetCode刷题班");
        deepList(file);
    }

}

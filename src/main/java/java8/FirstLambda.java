package java8;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
    public static void main(String[] args) {

//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//
//                return pathname.getName().endsWith(".xml");
//            }
//        };
        FileFilter filter = (File file)->file.getName().endsWith(".log");

        File dir  = new File("/home/mdaniyar");
        File[] files = dir.listFiles(filter);

        for (File f:
             files) {
            System.out.println(f);
        }
    }
}

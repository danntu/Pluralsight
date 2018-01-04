package java8;

import java.io.File;

public class JavaFileFilter implements FileFilter{
    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".java");
    }

    public static void main(String[] args) {
        JavaFileFilter fileFilter = new JavaFileFilter();
        File dir = new File("\\home\\mdaniyar");
        File[] javafiles = dir.listFiles((java.io.FileFilter) fileFilter);

        FileFilter f = (File file)->file.getName().endsWith(".java");

    }
}

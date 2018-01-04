package java8;

import java.io.File;

public interface FileFilter {
    boolean accept(File pathname);
}

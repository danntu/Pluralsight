package javacore;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import static javacore.Helper.*;

public class Main {
    public static void main(String[] args) {
        //doTryCatchFinally();
        doCloseThing();
        //doTryWithResources();
        //doTryWithResourcesMulti();
    }

    public static void doTryCatchFinally(){
        char[] buff = new char[8];
        int length;

        Reader reader =null;
        try{
            reader = openReader("file1.txt");
            while ((length=reader.read(buff))>=0){
                System.out.println("\nlength: "+length);
                for (int i = 0; i < length ; i++) {
                    System.out.print(buff[i]);
                }
            }
        } catch (IOException e){
            System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
        } finally {
            try {
                if (reader !=null)
                    reader.close();
            } catch (IOException e){
                System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
            }
        }

    }

    public static void doTryWithResources(){
        char[] buff = new char[8];
        int length;
        try(Reader reader = openReader("file1.txt")){
            while ((length=reader.read(buff))>=0){
                System.out.println("\nlength: "+length);
                for (int i = 0; i < length ; i++) {
                    System.out.print(buff[i]);
                }
            }
        } catch (IOException e){
            System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
        }
    }

    public static void doTryWithResourcesMulti(){
        char[] buff = new char[8];
        int length;
        try(Reader reader = openReader("file1.txt");
            Writer writer = openWriter("file2.txt")){
            while ((length=reader.read(buff))>=0){
                System.out.println("\nlength: "+length);
                writer.write(buff,0,length);
            }
        } catch (IOException e){
            System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
        }
    }

    private static void doCloseThing(){
        try(MyAutoCloseable ac = new MyAutoCloseable()){
            ac.saySomething();
        } catch (IOException e){
            System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println("Suppressed: "+t.getMessage());
        }
    }
}

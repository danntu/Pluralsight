package java8;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(
                            "Hello world from thread [" +
                                    Thread.currentThread().getName()+
                                    "]");

                }
            }
        };



        Runnable runnableLambda = ()->{
            for (int i = 0; i < 3; i++) {
                System.out.println(
                        "Hello world from thread [" +
                                Thread.currentThread().getName()+
                                "]");

            }
        };

        Thread t1  = new Thread(runnableLambda);
        t1.start();
        t1.join();

        Thread t2  = new Thread(runnable);
        t2.start();
        t2.join();
    }
}

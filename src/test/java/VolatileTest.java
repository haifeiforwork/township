public class VolatileTest {


    public static volatile int race = 0;

    public static void increase() {
        race ++ ;
    }

    public static int threadCount = 20;

    public static void main(String[] args ){
        Thread[] thread = new Thread[20];
        for (int i = 0; i<thread.length; i ++) {
            thread[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0; i < 1000; i++) {
                        increase();
                    }
                }
            });
            thread[i].start();
        }

        while(Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println("total race:" +race);
    }
}

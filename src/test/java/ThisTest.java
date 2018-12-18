public class ThisTest {

    public static Integer a = 2;

    public static void main(String[] args ){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                add();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                jian();
            }
        });
        thread2.start();
        thread1.start();
        System.out.println("a:" + a);
    }

    public static void add() {
        a++;
        System.out.println("a++");
    }

    public static void jian() {
        a--;
        System.out.println("a--");
    }
}

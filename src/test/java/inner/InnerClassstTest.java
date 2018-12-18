package inner;

public class InnerClassstTest {

    InnerClassstTest(String init) {
        this.init = init;
    }

    private String init = "init class";

    class InnerClassTest2 implements Service{
        private String init2 = init;
        @Override
        public void print() {
            System.out.println(init2);
        }
    }

    private InnerClassTest2 getInnerClassTest2() {
        return new InnerClassTest2();
    }


    public static void main(String[] args ){
        Service service = new InnerClassstTest("start init class").getInnerClassTest2();
        service.print();
    }
}

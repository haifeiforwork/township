package inner;

public class Implments2 implements Service {
    @Override
    public void print() {
        System.out.println(" this is Implments2");
    }

    public static Factroys factroys = new Factroys() {
        @Override
        public Service getService() {
            return new Implments2();
        };
        private String text = "";//测试
        private void initValue(String text) {
            this.text = text;
        }
    };
}

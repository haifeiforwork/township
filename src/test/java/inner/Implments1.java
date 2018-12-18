package inner;

public class Implments1 implements Service  {

    @Override
    public void print() {
        System.out.println(" this is Implments1");
    }

    public static Factroys factroys = new Factroys() {
        @Override
        public Service getService() {
            return new Implments1();
        }
    };

}

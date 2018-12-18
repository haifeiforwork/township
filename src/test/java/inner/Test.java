package inner;

public class Test {


    static void serviceConsumer(Factroys factroys) {
        Service service = factroys.getService();
        service.print();
    }


    public static void main(String[] args ){
        serviceConsumer(Implments2.factroys);

        serviceConsumer(Implments1.factroys);
    }

}

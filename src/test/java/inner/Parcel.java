package inner;

public class Parcel {

    Object[] objs;

    Integer init = 0;

    Parcel(Integer length) {
        objs = new Object[length];
    }

    public void add(Integer i) {
        if (init < objs.length) {
            objs[init++] = i;
        }
    }

    class Parcel1 implements ParcelInterface {
        private Integer i = 0;
        @Override
        public boolean end() {
            return i == objs.length;
        }

        @Override
        public int current() {
           return (Integer)objs[i];
        }

        @Override
        public void next() {
            if (i < objs.length) {
                i++;
            }
        }
    }

    public ParcelInterface get() {
        return new Parcel1();
    }

    public static void main(String[] args ){
        Parcel p = new Parcel(10);
        for (int i = 0 ; i < 10; i++ ) {
            p.add(i);
        }
        ParcelInterface interfac = p.get();
        while(!interfac.end()) {
            System.out.print(interfac.current() + " ");
            interfac.next();
        }
    }
}

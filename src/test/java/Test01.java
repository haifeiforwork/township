import org.township.entity.user.User;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    private static Integer number = 12;

    private static String text = "hello world!";

    static List<Integer> list;

    public static void main(String[] args ){
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        List<Integer> list2 = list;
       //InitValueTestMain initValueTestMain = new  InitValueTestMain();
        reset();
        System.out.println(text);

    }

    public static void add (int a,String userName) {
        a = 20;
        userName = "张三";
    }

    public static void reset() {
        text = "hello";
    }
}

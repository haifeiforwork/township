package inner;

public class InnerClssTest3 {


    /**
     *
     * 若是直接给匿名内部类赋值 则参数必须是final类型
     */
    public InnerClassstTest getInnClassTest(final Integer value) {

        return new InnerClassstTest("this is InnerClassstTest"){

          //  private Integer value1 = value ;

            public Integer initValue() {
                return value+1;
            }

        };

    }
}

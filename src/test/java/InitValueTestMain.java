public class InitValueTestMain {
    InitValueTest test1 = new InitValueTest(1);

    InitValueTestMain(){
        System.out.println("is construect");
        InitValueTest test2 = new InitValueTest(2);
        test3 = new InitValueTest(4);
    }

    InitValueTest test3 = new InitValueTest(3);
}

import java.util.function.Consumer;

public class Test {


    @org.junit.Test
    public void test1(){
        //java8之后的写法
        String str1 = "测试“无参数，无返回值”的Lambda表达式，实现接口内部实现类写法";
        Runnable r1 = () -> System.out.println(str1);
        r1.run();
    }


    @org.junit.Test
    public void test2(){
        //java8之后的写法
        String str1 = "测试“无参数，无返回值”的Lambda表达式，实现接口内部实现类写法";
        Runnable r1 = () -> System.out.println(str1);
        r1.run();

        Consumer<String> tConsumer = (x) -> System.out.println(x);
        tConsumer.accept("cc");

    }





}

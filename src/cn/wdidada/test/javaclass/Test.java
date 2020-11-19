package cn.wdidada.test.javaclass;

/**
 * @author chengwu2
 * @version 1.0
 * 2020-11-19  9:22
 */
public class Test {
    private static final String name ="name";

    private  int age;

    private static  String addr;

    public Test() {
    }
    private  void print(){
        System.out.println("print");
    }
    private static void printName(){
        System.out.println(name);
    }
    public String getName(){
        return name;
    }
}

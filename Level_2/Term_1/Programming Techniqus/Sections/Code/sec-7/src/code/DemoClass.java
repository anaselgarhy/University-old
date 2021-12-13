package code;

public class DemoClass implements FirstInterface, SecondInterface {
    @Override
    public void myMethod() {
        System.out.println("Text 1 ....");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Text 2 ....");
    }

    public static void main(String[] args) {
        new DemoClass().myMethod();
        new DemoClass().myOtherMethod();
    }
}

abstract class Base {
    abstract void fun();
}

class Derived extends Base {

    public void fun() {
        System.out.println("derived fun( ) is called ");
    }

}

public class Six8 {

    public static void main(String[] args) {
        // upcoming the following line will cause compiler error as the line tries to
        // create an instance of abstract class
        // Base b = new Base();

        // we can have references of Base type.

        Base b = new Derived();
        b.fun();
    }
}
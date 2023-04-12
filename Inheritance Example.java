class A {

     int i;
     int j;

     void showij() {
        System.out.println("i and j  : " + i + " " + j);
    }

}

class B extends A {

     int k;

     void showk() {
        System.out.println("K : " + k);
    }

    void sum() {
        System.out.println("i + j + k : " + (i + j + k));
    }

}

public class Sixone {
    public static void main( String[] args) {
         A superOb = new A();
         B subOb = new B();
        // the superclass may be used by itself.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("contents of superOb :");
        superOb.showij();
        System.out.println();

        /* the subclass has access to all public members of its superclass . */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("contents of subob :");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i , j and k in subOb : ");
        subOb.sum();

    }

}
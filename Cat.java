// demo 66

class Cat {
    void speak() {
        System.out.println("Meooonnn ! ");
    }
}

class PetCat extends Cat {
    void speak() {
        System.out.println("meowwwwww ! ");
    }

}

class MagicCat extends Cat {
    static boolean noOne;

    void speak() {
        if (noOne) {
            super.speak(); // use the super class defination
        } else {
            System.out.println("Hello !");
        }
    }
}

public class Six6 {

    public static void main(String[] args) {
        PetCat c1 = new PetCat();
        MagicCat c2 = new MagicCat();
        c2.noOne = true ;
        c2.speak() ;
        c1.speak() ;
        c2.noOne = false ;
        c2.speak() ;

    }
}

/*
Meooonnn ! 
meowwwwww !   
Hello Divyen !
*/


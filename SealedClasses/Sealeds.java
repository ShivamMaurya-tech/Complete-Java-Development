package SealedClasses;

public class Sealeds {
    public static void main(String args[]) {
        // Nothing here yet, but you could create objects if needed
        A objA = new B(); // This will work
        // A objA2 = new C(); // This will also work

    }
}

sealed class A  permits B, C {
    public A() {
        // super();
         System.out.println("This is a sealed class A");
    }
   
}

non-sealed class B extends A {
}

final class C extends A {
}



sealed interface  X permits Y{

}

sealed interface Y extends X{

}

final class Z implements Y{

}
//SEALED CLASS=================>In Sealed class when another class extends with another then that class will considered as final.
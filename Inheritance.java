class Base {
    int i;

    // Default constructor
    Base() {
        System.out.println("IN BASE CLASS CONSTRUCTOR");
    }

    // Parameterized constructor
    Base(int i) {
        this.i = i;
        System.err.println("BASE " + i);
    }
}

class Derived extends Base {
    int y;

    // Default constructor
    Derived() {
        System.out.println("IN DERIVED CLASS CONSTRUCTOR");
    }

    // Parameterized constructor
    Derived(int z) {
        super(z); // Call to the base class constructor
        z++;
        System.out.println("DERIVED " + z);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        final int x = 10;
        @SuppressWarnings("unused")
        Derived d = new Derived(x); // Create an instance of Derived
    }
}




public class mitMethodRef {
    public static void main() {
        mitNewInterface m1 = mittest::mitMethodRef;
        m1.mitSingleAbstractMethod();
    }
}

class mittest{
    public static void mitMethodRef() {
        System.out.println("I am original method");
    }
}
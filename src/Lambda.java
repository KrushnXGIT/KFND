
@FunctionalInterface
interface mitInterface{
    void somemethod();
}

//class mitimplementingclass implements mitInterface{
//    @Override
//    public void somemethod(){
//        System.out.println("Hello");
//    }
//}

interface multiply{
    void square(int x);
}

public class Lambda {
    public static void main() {
//        mitimplementingclass mitobj = new mitimplementingclass();
//        mitobj.somemethod();

        mitInterface mitobj = ()->{System.out.println("Hello");};
        mitobj.somemethod();

        multiply ops = (int x)-> {System.out.println("Square is "+ x*x);};
        ops.square(5);
    }
}




class SingletonClass{
    private static SingletonClass instance;

    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
            System.out.println("Created");
        }
        else{
            System.out.println("already there");
        }
        return instance;
    }
}


public class Main{
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        SingletonClass s3 = SingletonClass.getInstance();
        System.out.println("HashCode");

    }
}
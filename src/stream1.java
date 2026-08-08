
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        List<Integer> result=  arr.stream().filter(x->x % 2 !=0).collect(Collectors.toList());
        System.out.println(result);

    }
}
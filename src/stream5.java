import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class stream5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(40);
        arr.add(30);
        arr.add(50);
        List<Integer> res = arr.stream().distinct().collect(Collectors.toList());
        System.out.println(res);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class stream3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(45);
        arr.add(23);
        arr.add(89);
        arr.add(34);
        arr.add(67);

        List<Integer> res = arr.stream().sorted().collect(Collectors.toList());
        System.out.println(res.getLast());

    }
}

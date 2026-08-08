import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class stream4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("rahul");
        arr.add("amit");
        arr.add("priya");
        arr.add("neha");
        List<String> res = arr.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(res);

    }
}

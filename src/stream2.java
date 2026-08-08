import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream2 {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<String>();
        st.add("Java");
        st.add("Spring");
        st.add("Hibernate");
        st.add("SQL");
        st.add("Programming");
        List<String> res = st.stream().filter(x->x.length()>5).collect(Collectors.toList());
        System.out.println(res);
     }
}

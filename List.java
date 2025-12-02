import java.util.*;

public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");

        names.remove("C");

        System.out.println(names);
    }
}

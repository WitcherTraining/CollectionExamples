import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MethodDisjoint {
    public static void main(String[] args) {
        Collection<String> collection1 = Arrays.asList("red","cyan");
        Collection<String> collection2 = Arrays.asList("red","blue");
        Collection<String> collection3 = Arrays.asList("pink","tan");

        System.out.println(Collections.disjoint(collection1, collection2));
        System.out.println(Collections.disjoint(collection1, collection3));
    }
}

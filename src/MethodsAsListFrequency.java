import java.util.*;

public class MethodsAsListFrequency {
    public static void main(String[] args) {
        String init[] = {"One", "Two", "Three", "One", "Two", "Three"};
        List list1 = new ArrayList(Arrays.asList(init));
        List list2 = new ArrayList(Arrays.asList(init));
        list1.remove("One");
        System.out.println(list1);
        list2.removeAll(Collections.singleton("One"));
        System.out.println(list2);

        Collection<String> collection = Arrays.asList("red","cyan","red");
        System.out.println(Collections.frequency(collection, "red"));

        Collection<String> colors = Arrays.asList("red", "green", "blue");
        System.out.println(Collections.max(colors));
        System.out.println(Collections.min(colors));
    }
}

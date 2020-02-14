import java.util.EnumMap;

public class EnumMapExample {
    public static void main(String[] args) {

        EnumMap<Size, String> sizeMap = new EnumMap<>(Size.class);
        sizeMap.put(Size.S, "маленький");
        sizeMap.put(Size.M, "средний");
        sizeMap.put(Size.L, "большой");
        sizeMap.put(Size.XL, "очень большой");
        sizeMap.put(Size.XXL, "очень-очень большой");
        sizeMap.put(Size.XXXL, "ну оооооочень большой");
        for (Size size : Size.values()) {
            System.out.println(size + ":" + sizeMap.get(size));
        }
    }
}

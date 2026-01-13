import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // construct dari list
        List<String> unModifiedColor = List.of(
                "brown", "red");
        System.out.println(unModifiedColor);
        // unModifiedColor.add("yellow");
        // -> tidak berjalan, karena list.of() Inmutable atau tidak bisa diubah

        List<String> colors = new ArrayList<>();
        // List<String> colors = new LinkedList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        // colors.add(new Object()); -> error

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));

        System.out.println("-----");
        for (String c : colors) {
            System.out.println(c);
        }

        System.out.println("-----");
        colors.forEach(System.out::println);

        System.out.println("-----");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // List<String> colors = new ArrayList<>();
        // ArrayListList<String> colors = new ArrayList<>();

        // List<> -> lebih flexible dari pada ArrayList
        // ArrayList<>() -> bisa merubah objek turunan dari List seperti LinkedList<>()
    }
}

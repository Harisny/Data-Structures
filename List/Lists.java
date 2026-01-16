import java.util.ArrayList;
import java.util.LinkedList;
// import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // construct dari list
        List<String> unModifiedColor = List.of(
                "brown", "red");
        System.out.println("construct of List");
        System.out.println(unModifiedColor);
        // unModifiedColor.add("yellow");
        // -> tidak berjalan, karena list.of() Inmutable atau tidak bisa diubah

        System.out.println("");
        getColors();

        System.out.println("");
        getIt();

        // List<String> colors = new ArrayList<>();
        // ArrayListList<String> colors = new ArrayList<>();

        // List<> -> lebih flexible dari pada ArrayList
        // ArrayList<>() -> bisa merubah objek turunan dari List seperti LinkedList<>()
    }

    private static void getColors() {
        List<String> colors = new ArrayList<>();
        // List<String> colors = new LinkedList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        // colors.add(new Object()); -> error

        System.out.println("ArrayList");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));

        System.out.println("-----");
        for (String c : colors) {
            System.out.println(c);
        }

        // Kelas ArrayList memiliki array biasa di dalamnya. Ketika sebuah elemen
        // ditambahkan, elemen tersebut ditempatkan ke dalam array. Jika array tidak
        // cukup besar, array baru yang lebih besar akan dibuat untuk menggantikan array
        // lama dan array lama akan dihapus.

        // mthod access element arraylist
        // get - set - remove - clear - size

        // System.out.println("-----");
        // colors.forEach(System.out::println);

        // System.out.println("-----");
        // for (int i = 0; i < colors.size(); i++) {
        // System.out.println(colors.get(i));
        // }
    }

    private static void getIt() {
        List<String> it = new LinkedList<>();
        it.add("A");
        it.add("B");
        it.add("C");

        System.out.println("LinkedList");
        System.out.println(it);
        System.out.println(it.getFirst());
        System.out.println(it.removeLast());
        System.out.println(it);

        System.out.println("");
        for (String i : it) {
            System.out.println(i);
        }

        // Kelas LinkedList memiliki metode yang sama dengan ArrayList karena keduanya
        // mengikuti antarmuka List. Ini berarti Anda dapat menambahkan, mengubah,
        // menghapus, atau membersihkan elemen dalam LinkedList sama seperti yang Anda
        // lakukan dengan ArrayList.

        // method access element arraylist
        // get - set - remove - clear - size

        // Gunakan ArrayList untuk menyimpan dan mengakses data, dan LinkedList untuk
        // memanipulasi data.

        // method access dan manipulasi data
        // addFirst dan addLast - getFirst dan getLast - removeFirst dan removeLast

        // LinkedList menyimpan elemen-elemennya dalam "kontainer". Daftar tersebut
        // memiliki tautan ke kontainer pertama dan setiap kontainer memiliki tautan ke
        // kontainer berikutnya dalam daftar. Untuk menambahkan elemen ke daftar, elemen
        // tersebut ditempatkan ke dalam kontainer baru dan kontainer tersebut
        // dihubungkan ke salah satu kontainer lain dalam daftar.
    }

}

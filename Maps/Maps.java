import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("irfan"));
        map.put(2, new Person("aldi"));
        map.put(3, new Person("daka"));
        map.put(3, new Person("daka 1")); // -> implement key dari daka, tidak bisa duplikat

        System.out.println(map);
        System.out.println("object : " + map.size());
        System.out.println("get : " + map.get(1));
        // System.out.println(map.remove(3)); // menghapus value
        System.out.println("containsKey : " + map.containsKey(2));
        System.out.println(map.containsKey(4));
        System.out.println("is empty : " + map.isEmpty()); // false
        System.out.println("value : " + map.values()); // [1, 2, 3]
        System.out.println("entry set : " + map.entrySet()); // nilai value
        map.entrySet().forEach(x -> System.out.println(x.getValue())); // looping entry value
        map.entrySet().forEach(x -> System.out.println(x.getValue().name));
        System.out.println("key set : " + map.keySet()); // key value
        map.entrySet().forEach(x -> System.out.println(x.getKey())); // looping key value

    }

    public record Person(String name) {
    }
}

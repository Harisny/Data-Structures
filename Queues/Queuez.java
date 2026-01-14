import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Queuez {
    public static void main(String[] args) {
        getSupermarket();

        // LinkedList adalah implementasi dari interface Queue
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("salym", 20));
        linkedList.add(new Person("opal", 21));
        linkedList.add(new Person("riyan", 20));
        System.out.println(linkedList.size());

        ListIterator<Person> personIterator = linkedList.listIterator();
        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
            System.out.println(linkedList.peek());
        }
        System.out.println();
        while (personIterator.hasPrevious()) {
            System.out.println(personIterator.previous());
            System.out.println(linkedList.peek());
        }
    }

    private static void getSupermarket() {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Radit", 20)); // 1
        supermarket.add(new Person("Irfan", 21)); // 2
        supermarket.add(new Person("Aldi", 19)); // 3

        System.out.println(supermarket.peek()); // -> Top dari queue
        System.out.println(supermarket.size()); // 3
        System.out.println(supermarket.poll()); // -> menghapus antrian pertama/top
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println();
    };

    static record Person(String name, Integer age) {
    };
}

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Queuez {
    public static void main(String[] args) {
        // Queue -> FIFO(FIRST IN FIRST OUT)
        getSupermarket();
        // LinkedList -> implementasi dari queue dan list
        getPersonIterator();
    }

    private static void getPersonIterator() {
        // LinkedList adalah implementasi dari interface Queue
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("salym", 20));
        linkedList.add(new Person("opal", 21));
        linkedList.add(new Person("riyan", 20));
        System.out.println("LinkedList");
        System.out.println("jumlah : " + linkedList.size());

        // ITERATOR
        // Looping Through a Collection
        // To loop through a collection, use the hasNext() and next() methods of the
        // Iterator

        ListIterator<Person> personIterator = linkedList.listIterator();
        System.out.println("top of list : " + linkedList.peek());
        while (personIterator.hasNext()) {
            System.out.println(personIterator.hasNext());
            System.out.println("next iterator : " + personIterator.next());
        }
        System.out.println();
        System.out.println("last of list : " + linkedList.peekLast());
        while (personIterator.hasPrevious()) {
            System.out.println(personIterator.hasPrevious());
            System.out.println("previous iterator : " + personIterator.previous());
        }

        System.out.println();

        if (personIterator.hasNext()) {
            Person elemen = personIterator.next();
            System.out.println("panggil next() -> first elemen : " + elemen);
        }

        if (personIterator.hasNext()) {
            Person elemen = personIterator.next();
            System.out.println("panggil next() -> second elemen : " + elemen);
        }

        if (personIterator.hasPrevious()) {
            Person elemen = personIterator.previous();
            System.out.println("panggil previous() -> second elemen : " + elemen);
        }

        if (personIterator.hasPrevious()) {
            Person elemen = personIterator.previous();
            System.out.println("panggil previous() -> first elemen : " + elemen);
        }

        // Posisi Awal: ^ A, B, C (Cursor di paling depan)
        // Panggil next(): A ^ B, C (Mendapat A)
        // Panggil next() lagi: A, B ^ C (Mendapat B)
        // Panggil previous(): A ^ B, C (Mendapat B lagi karena dia melangkah mundur
        // melewati B)
    }

    private static void getSupermarket() {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Radit", 20)); // 1
        supermarket.add(new Person("Irfan", 21)); // 2
        supermarket.add(new Person("Aldi", 19)); // 3

        System.out.println("Queue");
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

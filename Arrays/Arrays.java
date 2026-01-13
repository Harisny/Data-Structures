public class Arrays {
    public static void main(String[] args) {
        String[] colors = new String[3];
        colors[0] = "blue";
        colors[1] = "yellow";

        System.out.println(colors[0]); // 1
        System.out.println(colors[1]); // 2
        System.out.println(colors[2]); // 3 -> null

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        cars[0] = "Opel";

        System.out.println(cars[0]); // Opel
        System.out.println(cars.length); // 4

        // extends
        // Integer[] number = new Integer[1];
        // Integer[] number = {"1", "2", "3", "4"};
    }
}

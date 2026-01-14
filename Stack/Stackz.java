import java.util.Stack;

public class Stackz {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); // -> Top dari stack
        System.out.println(stack.size());
        System.out.println(stack.pop()); // -> menghapus Top dari stack
        System.out.println(stack.size());
        System.out.println(stack.empty()); // check jika stack kosong
    }
}

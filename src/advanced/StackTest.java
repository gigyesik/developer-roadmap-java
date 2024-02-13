package advanced;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("a");
        stringStack.push("b");
        stringStack.push("c");
        stringStack.push("d");
        stringStack.push("e");
        stringStack.pop();

        Iterator<String> iterator = stringStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // a b c d
        }
    }
}

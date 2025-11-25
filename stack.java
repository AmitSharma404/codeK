import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Jarvis");
        stack.push("Innova");
        stack.push("Hilux");
        stack.push("Tundra");
        stack.push("LC 300");
        System.out.println(stack.capacity());
        // stack.pop();
        System.out.println(stack.search("LC 300"));
        // String poped = stack.pop();
        // System.out.println(poped);
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}

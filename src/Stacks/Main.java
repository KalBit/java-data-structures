package Stacks;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack.peek());
        stack.display();
    }
}

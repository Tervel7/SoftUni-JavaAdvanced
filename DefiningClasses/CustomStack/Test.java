package DefiningClasses.CustomStack;

public class Test {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();

        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);

        customStack.pop();

        customStack.push(8);
    }
}

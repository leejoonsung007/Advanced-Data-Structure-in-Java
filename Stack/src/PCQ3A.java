public class PCQ3A {

    public static void main(String[] args) {

        // create the stack
        ArrayStack<String> stack = new ArrayStack(2);

        //the initial state
        System.out.println("Stack has been created");
        System.out.println(stack.toString());

        //push and pop
        System.out.println("push('Ireland')");
        printPushOpearation(stack, "Ireland");

        System.out.println("pop()");
        printPopOpearation(stack);

        System.out.println("push('England')");
        printPushOpearation(stack, "England");

        System.out.println("pop()");
        printPopOpearation(stack);

        System.out.println("push('Wales')");
        printPushOpearation(stack, "Wales");

        System.out.println("pop()");
        printPopOpearation(stack);

        System.out.println("push('Scotland')");
        printPushOpearation(stack, "Scotland");

        System.out.println("pop()");
        printPopOpearation(stack);

        System.out.println("push('France')");
        printPushOpearation(stack, "France");

        System.out.println("push('Germany')");
        printPushOpearation(stack, "Germany");

    }

    public static void printPushOpearation(ArrayStack<String>stack, String value) {
        stack.push(value);
        System.out.println(stack.toString());
    }

    public static void printPopOpearation(ArrayStack<String>stack) {
        stack.pop();
        System.out.println(stack.toString());
    }

}

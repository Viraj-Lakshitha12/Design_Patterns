package behaviors.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddOperations());
        System.out.println("Add Operation (4,3): "+context.executeOperation(4,3));

        Context context1 = new Context(new SubstractOperations());
        System.out.println("Subtract Operation (4,3): "+context1.executeOperation(4,3));

        Context context2 = new Context(new MultipleOperation());
        System.out.println("Multiple Operation (4,3): "+context2.executeOperation(4,3));
    }

}

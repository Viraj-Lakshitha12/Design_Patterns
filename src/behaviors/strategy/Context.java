package behaviors.strategy;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int executeOperation(int num1,int num2){
        return strategy.doOpperations(num1,num2);

    }
}

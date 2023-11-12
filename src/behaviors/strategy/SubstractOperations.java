package behaviors.strategy;

public class SubstractOperations implements Strategy {
    @Override
    public int doOpperations(int num1, int num2) {
        return num1-num2;
    }
}

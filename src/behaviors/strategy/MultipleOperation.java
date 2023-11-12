package behaviors.strategy;

public class MultipleOperation implements Strategy{
    @Override
    public int doOpperations(int num1, int num2) {
        return num1*num2;
    }
}

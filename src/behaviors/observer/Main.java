package behaviors.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("\nvalue is : "+2);
        subject.setState(2);

        System.out.println("\nvalue is : "+14);
        subject.setState(14);
    }


}

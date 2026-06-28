package CH84;

public class Eagle extends Bird{
    @Override
    public void fly() {
        super.fly();
        System.out.println("Eagle is flying");
    }

    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.fly();
    }
}

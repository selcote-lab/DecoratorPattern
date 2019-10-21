public class Client {
    public static void main(String[] args) {
        System.out.println("*** Decorator pattern demo");
        Component component1 = new ConcreteComponent();

        AbstractDecorator decorator1 = new ConcreteDecorator1();
        decorator1.setComponent(component1);
        decorator1.doJob();

        AbstractDecorator decorator2 = new ConcreteDecorator2();
        decorator2.setComponent(component1);
        decorator2.doJob();
    }
}

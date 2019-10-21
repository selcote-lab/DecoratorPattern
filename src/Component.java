abstract class Component {
    public abstract void doJob();
}

class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from a concrete Component - I am closed for modification");
    }
}

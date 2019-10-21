abstract class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if(component != null){
            component.doJob();
        }
    }
}

class ConcreteDecorator1 extends AbstractDecorator {
    public void doJob(){
        super.doJob();
        System.out.println("Addional stuff");
    }
}

class ConcreteDecorator2 extends AbstractDecorator {
    public void doJob(){
        System.out.println("Super !");
        super.doJob();
        System.out.println("Addional stuff 2");
    }
}
package Task2;

public class MonitorFactory extends ComponentFactory{
    @Override
    public Component createComponentPC() {
        return new Monitor("", "not provided", "not provided", "", "","");
    }

}

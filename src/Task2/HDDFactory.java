package Task2;

public class HDDFactory extends ComponentFactory {
    @Override
    public Component createComponentPC() {
        return new HDD("", "", "", "", 0);
    }
}

package task3;

public class ConsoleLogger implements LightEventListener {
    @Override
    public void onEvent(String eventType, String tagName) {
        System.out.println("[Log]: Event '" + eventType + "' occurred on <" + tagName + ">");
    }
}
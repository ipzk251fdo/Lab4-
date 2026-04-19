package task3;

public class ActionHandler implements LightEventListener {
    @Override
    public void onEvent(String eventType, String tagName) {
        if (eventType.equals("click")) {
            System.out.println("[Action]: Handling click for <" + tagName + ">");
        }
    }
}
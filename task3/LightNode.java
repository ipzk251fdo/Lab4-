package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class LightNode {
    protected Map<String, List<LightEventListener>> listeners = new HashMap<>();

    public void addEventListener(String eventType, LightEventListener listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public void triggerEvent(String eventType) {
        if (listeners.containsKey(eventType)) {
            for (LightEventListener listener : listeners.get(eventType)) {
                listener.onEvent(eventType, getTagName());
            }
        }
    }

    public abstract String getTagName();
    public abstract String getOuterHTML();
}
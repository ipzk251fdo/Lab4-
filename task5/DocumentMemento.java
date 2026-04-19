package task5;

public class DocumentMemento {
    private final String state;

    public DocumentMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
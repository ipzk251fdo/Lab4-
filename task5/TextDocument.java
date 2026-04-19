package task5;

public class TextDocument {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public DocumentMemento createMemento() {
        return new DocumentMemento(content);
    }

    public void restore(DocumentMemento memento) {
        this.content = memento.getState();
    }
}
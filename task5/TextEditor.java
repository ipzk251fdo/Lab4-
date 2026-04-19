package task5;

import java.util.Stack;

public class TextEditor {
    private TextDocument document;
    private Stack<DocumentMemento> history = new Stack<>();

    public TextEditor(TextDocument document) {
        this.document = document;
    }

    public void write(String text) {
        history.push(document.createMemento());
        document.setContent(text);
        System.out.println("Text changed to: " + text);
    }

    public void undo() {
        if (!history.isEmpty()) {
            DocumentMemento memento = history.pop();
            document.restore(memento);
            System.out.println("Undo performed. Current text: " + document.getContent());
        } else {
            System.out.println("History is empty.");
        }
    }

    public void printCurrent() {
        System.out.println("Document content: " + document.getContent());
    }
}
package task5;

public class Main {
    public static void main(String[] args) {
        TextDocument doc = new TextDocument();
        doc.setContent("Initial text");

        TextEditor editor = new TextEditor(doc);
        editor.printCurrent();

        editor.write("First sentence.");
        editor.write("First and second sentence.");
        editor.write("Everything deleted!");

        editor.printCurrent();

        System.out.println("\n--- Performing Undo ---");
        editor.undo();
        editor.undo();
        editor.undo();

        System.out.println("\nFinal state:");
        editor.printCurrent();
    }
}
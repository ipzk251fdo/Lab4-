package task1;

public class Level2Handler extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 2) {
            System.out.println("Рівень 2: Технічну несправність усунено технічним спеціалістом.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        }
    }
}
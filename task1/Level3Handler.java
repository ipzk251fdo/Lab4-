package task1;

public class Level3Handler extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 3) {
            System.out.println("Рівень 3: Питання оплати та рахунків вирішено фінансовим менеджером.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        }
    }
}
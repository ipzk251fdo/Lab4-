package task1;

public class Level1Handler extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 1) {
            System.out.println("Рівень 1: Ваше питання щодо тарифів вирішено базовим оператором.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        }
    }
}
package task1;

public class Level4Handler extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 4) {
            System.out.println("Рівень 4: Вашу скаргу розглянуто адміністратором системи.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            System.out.println("На жаль, рівень підтримки не визначено.");
        }
    }
}
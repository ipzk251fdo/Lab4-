package task4;

public class NetworkLoadStrategy implements ImageLoadStrategy {
    @Override
    public void loadImage(String href) {
        System.out.println("[Network]: Завантаження картинки за URL-адресою: " + href);
    }
}
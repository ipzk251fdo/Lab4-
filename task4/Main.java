package task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Тестування стратегій завантаження ---");

        LightImageElement networkImg = new LightImageElement("https://example.com/photo.jpg");
        networkImg.display();

        LightImageElement localImg = new LightImageElement("C:/Users/Admin/Images/logo.png");
        localImg.display();
    }
}
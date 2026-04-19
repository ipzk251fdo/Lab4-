package task4;

public class FileSystemLoadStrategy implements ImageLoadStrategy {
    @Override
    public void loadImage(String href) {
        System.out.println("[File System]: Завантаження картинки з локального шляху: " + href);
    }
}
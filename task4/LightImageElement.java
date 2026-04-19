package task4;

public class LightImageElement {
    private String href;
    private ImageLoadStrategy strategy;

    public LightImageElement(String href) {
        this.href = href;
        if (href.startsWith("http://") || href.startsWith("https://")) {
            this.strategy = new NetworkLoadStrategy();
        } else {
            this.strategy = new FileSystemLoadStrategy();
        }
    }

    public void display() {
        strategy.loadImage(href);
    }
}
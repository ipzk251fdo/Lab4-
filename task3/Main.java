package task3;

public class Main {
    public static void main(String[] args) {
        LightElementNode button = new LightElementNode("button");
        LightElementNode div = new LightElementNode("div");

        ConsoleLogger logger = new ConsoleLogger();
        ActionHandler handler = new ActionHandler();

        button.addEventListener("click", logger);
        button.addEventListener("click", handler);
        div.addEventListener("mouseover", logger);

        button.triggerEvent("click");
        div.triggerEvent("mouseover");

        System.out.println(button.getOuterHTML());
    }
}
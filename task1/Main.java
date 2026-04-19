package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SupportHandler l1 = new Level1Handler();
        SupportHandler l2 = new Level2Handler();
        SupportHandler l3 = new Level3Handler();
        SupportHandler l4 = new Level4Handler();

        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);

        Scanner scanner = new Scanner(System.in);
        boolean solved = false;

        while (!solved) {
            System.out.println("\n--- Система підтримки (Ланцюжок) ---");
            System.out.println("1. Тарифи");
            System.out.println("2. Техпідтримка");
            System.out.println("3. Фінанси");
            System.out.println("4. Адміністрація");
            System.out.print("Виберіть варіант (або 0 для виходу): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Будь ласка, введіть число.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) break;

            if (choice >= 1 && choice <= 4) {
                l1.handleRequest(choice);
                solved = true;
            } else {
                System.out.println("Пункт не знайдено. Меню повторюється...");
            }
        }
        scanner.close();
    }
}

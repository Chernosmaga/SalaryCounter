import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nЭта программа поможет тебе посчитать свою почасовую зарплату за месяц");
        System.out.println("Какая у тебя ставка?");
        int money = scanner.nextInt();
        System.out.println("Ты хочешь ввести количество смен или часов?");
        String userInput = scanner.next();

        switch (userInput) {
            case "смен":
                System.out.println("Сколько было смен в этом месяце?");
                int days = scanner.nextInt();
                System.out.println("А сколько длится смена?");
                int lasts = scanner.nextInt();
                int sum = days * lasts;
                System.out.println("Посчитал общее количество часов\n В итоге " + sum + " часов");
                int total = money * sum;
                System.out.println("Зарплата в этом месяце " + total);
                break;
            case "часов":
                System.out.println("Сколько вышло часов в общем?");
                int hours = scanner.nextInt();
                int answer = hours * money;
                System.out.println("Зарплата в этом месяце " + answer);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }

}
import java.util.Scanner;

public class swiatla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jaki jest kolor Swiatła(zielony,żółty,czerwony)");
        String light = scanner.nextLine();

        switch (light) {
            case "zielone" -> System.out.println("Jedż");
            case "Zółte"   -> System.out.println("poczkekaj");
            case "czerwone"-> System.out.println("Stój");
            default        -> System.out.println("nie znam takiego koloru świateł");
        }
        scanner.close();
    }
}

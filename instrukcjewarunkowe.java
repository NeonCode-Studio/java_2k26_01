import java.util.Scanner;

public class instrukcjewarunkowe {
    public static void main(String[] args){
        System.out.println("NOWA WERSJA");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();

        System.out.println("Ile masz lat?");
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 18 && name.endsWith("a")){
            System.out.println("Jestes pelnoletnia");

        } else if(age >= 18 && !name.endsWith("a")) {
            System.out.println("Jeszcze nie jestes pelnoletni");
        } else if(age < 18 && name.endsWith("a")) {
            System.out.println("jeszcze jesteś niepełnoletnia");
        } else if(age < 18 && !name.endsWith("a")) {
            System.out.println("Jeszcze jestes nie pełnoletni");
        }

        System.out.println("Jaki jest kolor Swiatła(zielony,żółty,czerwony)");
        String light = scanner.nextLine();

        if (light.equalsIgnoreCase("zielony")){
            System.out.println("Możesz jechać");
        } else if (light.equalsIgnoreCase("zolty")){
            System.out.println("zatrzymaj sie i poczekaj chwilke");
        } else if (light.equalsIgnoreCase("czerwony")) {
            System.out.println("Stoj i poczekaj chwile");
        } else {
            System.out.println("to nie jest kolor| TO nie kolor Świateł");
        }
        scanner.close();
    }
}

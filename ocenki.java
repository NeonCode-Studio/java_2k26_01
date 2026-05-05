import java.util.Scanner;

public class ocenki {
    public static void main(String[] args){
        System.out.println("oceny na podstaiwe procentow");
        Scanner procent = new Scanner(System.in);

        System.out.println("podaj jaki masz wynik (0-100");
        int wynik = Integer.parseInt(procent.nextLine());

        if (wynik >= 90 && wynik <= 100) {
            System.out.println("Otrzymujesz ocene 5");
        } else if(wynik <=89 && wynik >= 80) {
            System.out.println("Otrzymujesz ocene 4");
        } else if(wynik <=79 && wynik >= 70) {
            System.out.println("Otrzymujesz ocnene 3");
        } else if(wynik <=69 && wynik >= 60) {
            System.out.println("Otrzymujesz ocene 2");
        } else if(wynik < 60 && wynik >= 0) {
            System.out.println("Otrzymujesz ocene 1");
        } else {
            System.out.println("podaj poprawny wynik");
        }
        procent.close();
    }
}

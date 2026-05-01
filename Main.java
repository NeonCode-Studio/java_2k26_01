import java.util.Scanner;

public class Main {
        public static void main(String[] args) {  
            Scanner scanner = new Scanner(System.in);

            System.out.println("jak masz na imie ?");
            String imie = scanner.nextLine();

            System.out.println("ile masz lat ?");
            int wiek = scanner.nextInt(); 

            System.out.println("Cześć "+ imie + " !Masz "+ wiek +" lat!");
            scanner.close();
    }
}
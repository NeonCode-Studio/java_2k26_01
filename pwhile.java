import java.util.Scanner;

public class pwhile {
    public static void main(String[] args){
        boolean shouldcontinue = true;
        Scanner scanner = new Scanner(System.in);
        while (shouldcontinue) {
            System.out.println("czy chcesz kontynuować?");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Tak")) {
                shouldcontinue = true;
            } else if (answer.equalsIgnoreCase("nie")) {
                shouldcontinue = false;
            } else {
                System.out.println("nie rozumiem odpowiedzi");
            }
        }
    }
}

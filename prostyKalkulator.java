import java.util.Scanner;
/*prosty kalkulator do dodawania w java */
public class prostyKalkulator {
    public static void main(String[] args){
        Scanner wejscie = new Scanner (System.in);

        System.out.println("prosty kalkulator do dodawania w JaVa");

        int a;
        System.out.println("podaj pierwsza zmienna do dodania:");
        a = wejscie.nextInt();  

        int b;
        System.out.println("podaj druga zmienna do dodania:");
        b = wejscie.nextInt();

        int wynik;
        wynik = a+b;
        
        System.out.println("Twoj wynik to " + wynik);

        wejscie.close();
    }
}

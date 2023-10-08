import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int brojZaPogadjanje = random.nextInt(5);
            int brojPogadjanja = 0;
            int maksimalniBrojPokusaja = 3;
            System.out.println("Koji broj sam zamislio? ");
            while (brojPogadjanja < maksimalniBrojPokusaja) {
                brojPogadjanja++;
                System.out.print("Unesi broj:");
                int unos = scanner.nextInt();
                if (unos < 0 || unos > 5) {
                    System.out.println("Broj koji unesete mora biti izmedju 0 i 5.");
                } else if (unos < brojZaPogadjanje) {
                    System.out.println("Zamisljeni broj je veći.");
                } else if (unos > brojZaPogadjanje) {
                    System.out.println("Zamisljeni broj je manji.");
                } else if (brojPogadjanja == 1) {
                    System.out.println("POGODAK! Zamisljeni broj je bio " + brojZaPogadjanje + ". Pogodili ste ga iz jednog pokušaja.");
                    break;
                } else {
                    System.out.println("POGODAK! Zamisljeni broj je bio " + brojZaPogadjanje + ". Pogodili ste ga u " + brojPogadjanja + " pokušaja.");
                    break;
                }
                if (brojPogadjanja == maksimalniBrojPokusaja) {
                    System.out.println("Niste pogodili. Zamisljeni broj je bio " + brojZaPogadjanje + ".");
                }
            }
            System.out.print("Da li želite da igrate ponovo? (da/ne): ");
            String ponovo = scanner.next();
            if (ponovo.equals("ne")) {
                break;
            }
        }


    }
}
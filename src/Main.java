import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pogodak = 7;
        int pokusaj;

        do {
            System.out.println("Unesite broj: ");
            pokusaj = sc.nextInt();
        }while (pokusaj < pogodak || pokusaj > pogodak);

        System.out.println("Pogodak!!!");
    }
}


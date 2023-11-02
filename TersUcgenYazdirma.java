package java101;
import java.util.Scanner;

public class TersUcgenYazdirma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamakSayisi = scanner.nextInt();

        if (basamakSayisi <= 0) {
            System.out.println("Geçersiz giriş.");
            return;
        }

        for (int i = 1; i <= basamakSayisi; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (basamakSayisi - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

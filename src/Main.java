import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> bolunen3 = new ArrayList<>();
        ArrayList<Integer> bolunen4 = new ArrayList<>();

        System.out.print("sayiyi girin: ");
        sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0) {
                bolunen3.add(i);
            }
            if (i % 4 == 0) {
                bolunen4.add(i);
            }
        }

        System.out.println("3'e bölünen sayılar: " + bolunen3);
        System.out.println("4'e bölünen sayılar: " + bolunen4);
    }
}

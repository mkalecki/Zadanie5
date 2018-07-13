import java.util.Scanner;

public class Zad5_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int quessNumber;
        System.out.println("Podaj liczbę:");
        int userChoise = scan.nextInt();

        while (userChoise<100 || userChoise>200 || userChoise%3!=0) {
            if (userChoise<100){
                System.out.println("Liczba jest za mała");
            }
            if (userChoise>200){
                System.out.println("Liczba jest za duża");
            }
            if (userChoise%3!=0){
                System.out.println("Liczba nie jest podzielna przez 3");
            }
            System.out.println("Podaj inną liczbę");
            userChoise = scan.nextInt();

        }
        System.out.println("Liczba jest OK");




    }
}

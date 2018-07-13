import java.util.Scanner;

public class Zad5_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String [5];

        System.out.println("Podaj 5 imion:");

        for (int i=0; i < names.length; i++) {

            names[i] = input.nextLine();
        }

        for (int i = 4; i >=0; i--) {
            System.out.println("Cześć " + names[i]);
        }
    }
}

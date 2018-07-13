import java.util.Scanner;

public class zad5_1 {
    public static void main(String[] args) {
        String [] names = new String [3];
        Scanner input = new Scanner(System.in);

        Integer i = 0;
        while (i<3) {
            System.out.println("Podaj imię" + (i+1));
            names[i] = input.nextLine();
            i++;
        }

        System.out.print("Wybrane imiona: ");
        i=0;
        while (i<3) {
            System.out.print(names[i] + " ");
            i++;
        }

    }
}

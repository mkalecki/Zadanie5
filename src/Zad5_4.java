import java.util.Scanner;

public class Zad5_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("podaj współrzędną X:");
        int x = input.nextInt();

        System.out.println("podaj współrzędną Y");
        int y = input.nextInt();

        if ((x > 0) && (y > 0)) {
            System.out.printf("Punkt (%d,%d) leży w I ćwiartce układu współrzędnych", x, y);
        }

        if (x<0 && y>0) {
            System.out.printf("Punkt (%d, %d) leży w II ćwiartce układu współrzędnych", x, y);
        }

        if (x<0 && y<0) {
            System.out.printf("Punkt (%d, %d) leży w III ćwiartce układu współrzędnych", x, y);
        }

        if (x>0 && y<0) {
            System.out.printf("Punkt (%d, %d) leży w IV ćwiartce układu współrzędnych", x, y);
        }


    }
}

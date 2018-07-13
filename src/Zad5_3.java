
public class Zad5_3 {
    public static void main(String[] args) {


        double number = 0;
        while (number < 3.1) {
            System.out.printf("%.1f  ",number);
            number += 0.1;
        }

        System.out.println();
        number = 0;
        do {
            System.out.printf("%.1f  ",number);
            number += 0.1;
        }
        while (number < 3.1);

    }
}

public class Zad5_5 {

    public static void main(String[] args) {

        int number = 0;
        int suma = 0;
        do {
            System.out.print(number + " ");
            number += 2;

            suma = suma + number;

        } while (number <= 100);

        System.out.println("\nW sumie to jest " + suma);


    }
}

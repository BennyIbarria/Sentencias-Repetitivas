import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double notaMayor5 = 0.0;
        Double notaMenor5 = 0.0;
        Double nota = 0.0;
        int i;
        System.out.println("En escala del 1 al 7 y con punto decimal");
        for (i = 1; i <= 20; i++) {
            System.out.print("Capture la nota " + i + " del alumno: ");
            nota = sc.nextDouble();
            if (nota == 0) {
                System.out.println("\nCapturó una nota en 0, el programa finalizará...!\n");
                break;
            }
            if (nota > 5) {
                notaMayor5 = notaMayor5 + nota;
            } else if (nota <= 4) {
                notaMenor5 = notaMenor5 + nota;
            }
        }
        i = i - 1;
        double promedioNotaMayor5 = notaMayor5 / i;
        double promedioNotaMenor5 = notaMenor5 / i;
        double promedioGeneral = (notaMayor5 + notaMenor5) / i;

        System.out.println("promedioNotaMayo5 = " + promedioNotaMayor5);
        System.out.println("promedioNotaMenor5 = " + promedioNotaMenor5);
        System.out.println("La cantidad de notas ingresadas son: " + i);
        System.out.println("El promedioGeneral = " + promedioGeneral);

    }
}

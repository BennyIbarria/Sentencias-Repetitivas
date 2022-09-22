public class BuclesConEtiquetas {
    public static void main(String[] args) {

        bucle:
        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia, " + i + " : No laborable!!!");
                    continue bucle;
                }
                System.out.println("Dia, " + i + ", Trabajando a las " + j + " hrs. ");
            }
        }
    }
}

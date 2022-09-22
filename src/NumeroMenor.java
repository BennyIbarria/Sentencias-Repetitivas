import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {

        //Clase para solicitar datos de entrada por consola
        Scanner sc = new Scanner(System.in);
        System.out.print("Capture la cantidad de numeros a comparar: ");
        int numerosACapturar=sc.nextInt();
        if (numerosACapturar<10){
            System.out.println("Debe de capturar 10 numeros enteros");
            main(args);
        }else {
            int numeroMenor = 10;
            //Inicio de la sentencia for para solicitar una cantidad determinada de valores
            for (int i = 1; i <= numerosACapturar; i++) {
                //Pedir al usuario hasta 10 registros
                System.out.print("Capture el numero " + i + " : ");
                int numero = sc.nextInt();
                //Si, el numero capturado por el usuario es menor al numero ancla entonces:
                if (numero < numeroMenor) {
                    System.out.println("el numero menor es menor que 10");
                    //De lo contrario será igual o mayor que....
                } else {
                    System.out.println("El numero menor es igual o mayor que 10");
                }
            }
        }
    }
}

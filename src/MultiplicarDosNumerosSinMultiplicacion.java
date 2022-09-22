import java.util.Scanner;

public class MultiplicarDosNumerosSinMultiplicacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Capture el numero a multiplicar: ");
        int numero1 = sc.nextInt();
        System.out.print("Capture el numero por el cual multiplicar el primero: ");
        int numero2 = sc.nextInt();

        //Verificar si los nmeros capturados son positivos
        boolean aNumero1Positvo = numero1 > -1;
        boolean aNumero2Positivo = numero2 > -1;

        //Convertimos a valor absoluto de numero 2 con la función abs de la clas Math
        //Para evitar que el bucle vaya hacia negativo y no se logre la iteración
        int absolutoNumero2 = Math.abs(numero2);

        int total = 0;

        for (int i = 0; i < absolutoNumero2; i++) {
            total = numero1 + total;
        }
        //Cambiar el signo en caso de que los numeros capturados por el usuario sean negativos
        if ((!aNumero2Positivo && aNumero1Positvo) || !aNumero2Positivo){
            total = -total;
        }
        //Imprimir el resultado de la "Multiplicación"
        System.out.println("total = " + total);

    }
}

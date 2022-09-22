public class SentenciaWhileDoWhile {
    public static void main(String[] args) {
        int numero=0;
        int i = 0;
        while(i<=10){
            System.out.println("numero = " + i);
            i++;
        }
        i=0;
        boolean prueba =true;

        while (prueba){
            if(i==7){
                prueba=false;
            }
            System.out.println("i = " + i);
            i++;
        }
        prueba=false;
        while (prueba){
            System.out.println("esto nunca se va a ejecutar porque es False");
        }

        do {
            System.out.println("Al menos se va a ejecutar una sola vez");
        }while(prueba);

        prueba=true;
        i=0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while(prueba);
    }
}


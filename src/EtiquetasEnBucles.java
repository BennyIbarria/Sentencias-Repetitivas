public class EtiquetasEnBucles {
    public static void main(String[] args) {

        String frase= "trigo tres tristes tigres tragaban trigo en un trigal trigo";
        String palabra="trigo";

        int maxPalabra=palabra.length();
        int cantidad=frase.length()-maxPalabra;


        int sumaLetras=0;
        char letra='g';

        buscar:
        for (int i= 0; i<=cantidad;){
            int k = i;
            for (int j = 0; j < maxPalabra; j++){
                if (frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue buscar;
                }
            }

            sumaLetras++;
            i = i + maxPalabra;

        }
        System.out.println("Ha sido encontrada la palabra " + palabra + " "+ sumaLetras + " de veces en la frase");
    }
}

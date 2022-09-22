public class SentenciaForEach {
    public static void main(String[] args) {

        int numeros[] = {1, 3, 5, 7, 9, 11, 13, 15};
         for (int num:numeros){
             System.out.println("numeros = " + num);
         }

         String[] nombres ={"José", "Bastian", "Nohemi", "Camila", "Leah"};
         for (String nombre:nombres){
             System.out.println("nombres: " + nombre);
         }

    }
}

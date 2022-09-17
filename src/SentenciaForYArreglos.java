import javax.swing.*;

public class SentenciaForYArreglos {
    public static void main(String[] args) {
        String nombres[] = {"Jose", "Benito", "Nohemi", "Beatriz", "Luis"};
        int contador = nombres.length;

        /*for (int i=0; i<contador;i++){
            if (nombres[i].equalsIgnoreCase("jose")||
            nombres[i].equalsIgnoreCase("nohemi")){
                continue;
            }
            System.out.println("nombre "+ i + ".- " + nombres[i]);
        }*/
        String buscar= JOptionPane.showInputDialog("Capture un nombre a buscar como por ejemplo \"jose\" o \"luis\" " );
        boolean nombreEncontrado =false;
        for (int i=0; i<contador;i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                nombreEncontrado=true;
                break;
            }
        }
        if (nombreEncontrado){
            JOptionPane.showMessageDialog(null, "El nombre " + buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, "El nombre " + buscar + " no fue encontrado en el sistema");
        }
    }
}

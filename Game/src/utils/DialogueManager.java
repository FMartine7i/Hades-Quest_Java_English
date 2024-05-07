package utils;
import java.util.List;

public class DialogueManager {
    public static void displayDialogue(List<String> optionsDialogue){
        //calcular longitud de texto más larga
        int maxLength = 0;
        for (String option : optionsDialogue){
            maxLength = Math.max(maxLength, option.length());
        }

        //calcular longitud del 'techo' del cuadro de diálogo
        int boxWidth = (maxLength)*2 + 4;

        System.out.println("+" + "-".repeat(boxWidth - 2) + "+");
        for (int i = 0; i < optionsDialogue.size(); i++){
            System.out.println("| " + (i + 1) + ". " + optionsDialogue.get(i) + " ".repeat(boxWidth - optionsDialogue.get(i).length() - 6) + "|");
        }
        System.out.println("+" + "-".repeat(boxWidth - 2) + "+"); //'piso' del cuadro de diálogo
    }
}

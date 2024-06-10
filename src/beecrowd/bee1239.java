import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            
            String html = translateToHTML(text);
            
            System.out.println(html);
        }
        
        scanner.close();
    }
    
    private static String translateToHTML(String text) {
        StringBuilder html = new StringBuilder();
        
        boolean italic = false;
        boolean bold = false;
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (c == '_') {
                if (!italic) {
                    html.append("<i>");
                } else {
                    html.append("</i>");
                }
                italic = !italic;
            } else if (c == '*') {
                if (!bold) {
                    html.append("<b>");
                } else {
                    html.append("</b>");
                }
                bold = !bold;
            } else {
                html.append(c);
            }
        }
        
        if (italic) {
            html.append("</i>");
        }
        
        if (bold) {
            html.append("</b>");
        }
        
        return html.toString();
 
    }
 
}
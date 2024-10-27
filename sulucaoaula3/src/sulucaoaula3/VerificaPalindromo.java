package sulucaoaula3;

import java.util.Scanner;

public class VerificaPalindromo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase ou palavra:");
        String input = scanner.nextLine();
        
        // Remover espaços, acentos e converter para minúsculas
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase().replaceAll("[áàâãä]", "a")
                                  .replaceAll("[éèêë]", "e").replaceAll("[íìîï]", "i")
                                  .replaceAll("[óòôõö]", "o").replaceAll("[úùûü]", "u")
                                  .replaceAll("ç", "c");
        
        if (isPalindromo(cleanInput)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindromo(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

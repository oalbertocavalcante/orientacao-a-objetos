/* Crie um programa que leia três valores a,b e c, todos do tipo float, e retorne o valor lógico 
 * da seguinte expressão:
a*a == (b * b + c * c)
Utilize a entrada e saída gráfica de Java para ler e apresentar os resultados.
Dica: para realizar a entrada e saida gráfica você deverá fazer o type-casting de String para float.
*/
package solucaoaula2;

import javax.swing.JOptionPane;

public class ValorLogicoGrafico {

    public static void main(String[] args) {
        // Interação com o usuário:
        String strA = JOptionPane.showInputDialog("Digite um valor para A:");
        float A = Float.parseFloat(strA);

        String strB = JOptionPane.showInputDialog("Digite um valor para B:");
        float B = Float.parseFloat(strB);

        String strC = JOptionPane.showInputDialog("Digite um valor para C:");
        float C = Float.parseFloat(strC);

        // Exibindo os valores para confirmação
        String mensagem = "Neste caso a expressão A*A == (B * B + C * C) é: \n:";
        	   mensagem += A*A == (B * B + C * C);
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

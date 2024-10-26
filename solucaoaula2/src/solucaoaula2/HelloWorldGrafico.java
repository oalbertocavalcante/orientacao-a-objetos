
/*
Crie um programa "Hello World" em Java, capaz de ler seu nome e apresentar a seguinte mensagem:
Olá <Fulano>, seja bem vindo! Apresente a mensagem em modo console e modo gráfico.
*/

package solucaoaula2;

import javax.swing.JOptionPane;

public class HelloWorldGrafico {

	public static void main(String[] args) {
		// variáveis do meu programa:
		String nome, 
			   strAnoNascimento;
		int AnoNascimento;
		
		// Interação com o usuário:
		nome = JOptionPane.showInputDialog("Informe o nome do cidadão: ");
		strAnoNascimento = JOptionPane.showInputDialog("Informe o ano de nascimento: ");
		AnoNascimento = Integer.parseInt(strAnoNascimento); //Type-casting (nesse caso: down-casting)
		
		String resposta = "Olá " + nome + "\n";
		resposta += "Você tem " + (2024 - AnoNascimento) + " anos de idade.";

		JOptionPane.showInputDialog(null, resposta);
	}

}

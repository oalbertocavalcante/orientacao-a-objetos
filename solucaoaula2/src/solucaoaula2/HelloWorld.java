package solucaoaula2;

import java.util.Scanner;
//////////////////////////////////////////////Pacotes e bibliotecas
public class HelloWorld {

	public static void main(String[] args) {
///////////////////////////////////////////////Inicio do algoritimo
		
		// Instruções do algoritimo
		String nome;
		int anoNascimento; //Variáveis do meu programa
		
		Scanner sc = new Scanner(System.in); //"abrir o canal com a entrada padrão"
		
		// Interação com o usuário:
		System.out.println("Informe o nome do cidadão: ");
		nome = sc.nextLine(); // Leitura de um string via teclado
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		String resposta = "Olá " + nome + "!" + "\n";
		resposta += "Você tem " + (2024 - anoNascimento) + " anos de idades.";
	
		System.out.println(resposta); //impressão para o usuário
	
//////////////////////////////////////////////Fim do algoritmo
	}

}
//////////////////////////////////////////////

package solucaoaula2;

import java.util.Scanner;

public class Leituravaloresinteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		
		Scanner sc = new Scanner(System.in); //"abrir o canal com a entrada padrão"
		
		// Interação com o usuário:
		System.out.println("Informe o valor de um inteiro: ");
		a = sc.nextInt(); // Leitura de um valor inteiro
		System.out.println("Informe o valor de outro inteiro: ");
		b = sc.nextInt(); // Leitura de um valor inteiro
		
		String resposta = "A soma dos valores inteiros é: " + (a+b) + ". A subtração dos valores inteiros é " + (a-b) + "\n";
		resposta +=	"A multiplicação entre os valores inteiros é: " + (a*b) + ". A divisão de inteiros é :" + (a/b) + "\n";
		resposta += "O operador de XOR entre os valores é: " + (a^b);
	
		System.out.println(resposta); //impressão para o usuário	

	}

}

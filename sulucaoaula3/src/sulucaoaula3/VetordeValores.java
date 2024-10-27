/*
 * Crie um programa que solicite ao usuário que preencha um vetor de valores inteiros de tamanho x (a ser informado 
 * pelo próprio usuário durante a execução do programa). Uma vez que os valores forem lidos e armazenados no vetor, 
 * o programa deverá informar ao usuário:
qual a média dos valores lidos;
quantidade de números positivos;
quantidade de números negativos;
quantidade de zeros;
quantidade de números pares;
quantidade de números ímpares.
Para cada um desses casos acima, crie uma função capaz de calcular e retornar as respostas.

"Pontapé" para o exercício está disponível no diretório dessa aula, com o nome 
 */

package sulucaoaula3;

import java.util.Scanner;

public class VetordeValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Preencha o vetor com valores inteiros:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        System.out.printf("Média dos valores lidos: %.2f%n", calcularMedia(vetor));
        System.out.println("Quantidade de números positivos: " + contarPositivos(vetor));
        System.out.println("Quantidade de números negativos: " + contarNegativos(vetor));
        System.out.println("Quantidade de zeros: " + contarZeros(vetor));
        System.out.println("Quantidade de números pares: " + contarPares(vetor));
        System.out.println("Quantidade de números ímpares: " + contarImpares(vetor));
        
        scanner.close();
    }

    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return (double) soma / vetor.length;
    }

    public static int contarPositivos(int[] vetor) {
        int contagem = 0;
        for (int valor : vetor) {
            if (valor > 0) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int contarNegativos(int[] vetor) {
        int contagem = 0;
        for (int valor : vetor) {
            if (valor < 0) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int contarZeros(int[] vetor) {
        int contagem = 0;
        for (int valor : vetor) {
            if (valor == 0) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int contarPares(int[] vetor) {
        int contagem = 0;
        for (int valor : vetor) {
            if (valor % 2 == 0) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int contarImpares(int[] vetor) {
        int contagem = 0;
        for (int valor : vetor) {
            if (valor % 2 != 0) {
                contagem++;
            }
        }
        return contagem;
    }
}

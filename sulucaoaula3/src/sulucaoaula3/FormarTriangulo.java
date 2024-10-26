/*
Crie um programa que leia três valores do teclado (a, b e c) como sendo lados de um triângulo. 
Crie uma função que informe se tais lados formam um triângulo. Condições: 
|b-c| < a < b+c
|a-c| < b < a+c
|a-b| < c < a+b
*/

package sulucaoaula3;

import java.util.Scanner;

public class FormarTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // "abrir o canal de entrada padrão"

        System.out.println("Digite um valor para o lado A: ");
        float A = sc.nextFloat(); // Leitura de um valor float

        System.out.println("Digite um valor para o lado B: ");
        float B = sc.nextFloat(); // Leitura de um valor float

        System.out.println("Digite um valor para o lado C: ");
        float C = sc.nextFloat(); // Leitura de um valor float

        // Verificar se os lados podem formar um triângulo
        if (formaTriangulo(A, B, C)) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
        sc.close();
    }

    // Função que verifica se é triângulo
    public static boolean formaTriangulo(float A, float B, float C) {
        // Condições para formação de triângulo
        return Math.abs(B - C) < A && A < (B + C) &&
               Math.abs(A - C) < B && B < (A + C) &&
               Math.abs(A - B) < C && C < (A + B);
    }
}

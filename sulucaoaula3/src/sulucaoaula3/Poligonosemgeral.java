/*
 * Crie um programa que seja capaz de ler os dados e calcular o perímetro e a área das seguintes figuras geométricas: 
 * círculo, quadrado, retângulo e trapézio. O usuário deverá inicialmente informar qual a figura geométrica e, a 
 * partir de então, os programa deverá ler os dados da figura e calcular seu perímetro e área. Utilize funções para o 
 * cálculo da área e do perímetro de figura.
Exemplo de utilização:

Escolha a figura geométrica desejada  
1 - Circulo  
2 - Quadrado  
3 - Retângulo  
4 - Trapézio  
5 - Triângulo
Supondo que o usuário tenha escolhido a opção Círculo, o programa apresenta a seguinte mensagem em seguida:
Informe o raio do círculo

Tendo o usuário informado 10 como raio do círculo, o programa apresentará em seguida:
O perímetro do círculo é 62,8 e a área é 314,15.

Note

1 - Será necessário importar a biblioteca Math java.lang.Math para fazer o uso da constante PI e de funções como potencia, 
dentre outras.
2 - Dica: utilize a instrução switch-case para realizar os cálculos de área e perímetro conforme o tipo de figura selecionada
pelo usuário.

Para o caso do triângulo, crie uma função que avalie se os lados informados são capazes de formar um triângulo. Para tal, 
as seguintes regras devem ser satisfeitas:
|b-c| < a < b+c
|a-c| < b < a+c
|a-b| < c < a+b
Para o caso do triângulo o programa deverá ainda verificar se os lados formam um triângulo retângulo. 
Caso sejam lados de um triângulo retângulo, o cálculo da área deverá ser feito através da fórmula do Teorema de Pitágoras. 
Utilize uma função para fazer tal verificação e cálculo.
 */

package sulucaoaula3;

import java.util.Scanner;

public class Poligonosemgeral {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha a figura geométrica desejada:");
        System.out.println("1 - Círculo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Trapézio");
        System.out.println("5 - Triângulo");
        
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("Informe o raio do círculo:");
                double raio = scanner.nextDouble();
                System.out.printf("O perímetro do círculo é %.2f e a área é %.2f.%n", calcularPerimetroCirculo(raio), calcularAreaCirculo(raio));
                break;
            case 2:
                System.out.println("Informe o lado do quadrado:");
                double lado = scanner.nextDouble();
                System.out.printf("O perímetro do quadrado é %.2f e a área é %.2f.%n", calcularPerimetroQuadrado(lado), calcularAreaQuadrado(lado));
                break;
            case 3:
                System.out.println("Informe a largura do retângulo:");
                double largura = scanner.nextDouble();
                System.out.println("Informe a altura do retângulo:");
                double altura = scanner.nextDouble();
                System.out.printf("O perímetro do retângulo é %.2f e a área é %.2f.%n", calcularPerimetroRetangulo(largura, altura), calcularAreaRetangulo(largura, altura));
                break;
            case 4:
                System.out.println("Informe a base maior do trapézio:");
                double baseMaior = scanner.nextDouble();
                System.out.println("Informe a base menor do trapézio:");
                double baseMenor = scanner.nextDouble();
                System.out.println("Informe a altura do trapézio:");
                double alturaTrapezio = scanner.nextDouble();
                System.out.println("Informe os dois lados do trapézio:");
                double lado1 = scanner.nextDouble();
                double lado2 = scanner.nextDouble();
                System.out.printf("O perímetro do trapézio é %.2f e a área é %.2f.%n", calcularPerimetroTrapezio(baseMaior, baseMenor, lado1, lado2), calcularAreaTrapezio(baseMaior, baseMenor, alturaTrapezio));
                break;
            case 5:
                System.out.println("Informe os três lados do triângulo:");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                if (isTrianguloValido(a, b, c)) {
                    if (isTrianguloRetangulo(a, b, c)) {
                        System.out.printf("A área do triângulo retângulo é %.2f.%n", calcularAreaTrianguloRetangulo(a, b));
                    } else {
                        System.out.printf("O perímetro do triângulo é %.2f e a área é %.2f.%n", calcularPerimetroTriangulo(a, b, c), calcularAreaTriangulo(a, b, c));
                    }
                } else {
                    System.out.println("Os lados informados não formam um triângulo válido.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
    
    public static double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularAreaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double calcularPerimetroRetangulo(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    public static double calcularPerimetroTrapezio(double baseMaior, double baseMenor, double lado1, double lado2) {
        return baseMaior + baseMenor + lado1 + lado2;
    }

    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static double calcularPerimetroTriangulo(double a, double b, double c) {
        return a + b + c;
    }

    public static double calcularAreaTriangulo(double a, double b, double c) {
        double s = calcularPerimetroTriangulo(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static boolean isTrianguloValido(double a, double b, double c) {
        return Math.abs(b - c) < a && a < (b + c) && Math.abs(a - c) < b && b < (a + c) && Math.abs(a - b) < c && c < (a + b);
    }

    public static boolean isTrianguloRetangulo(double a, double b, double c) {
        double[] lados = {a, b, c};
        java.util.Arrays.sort(lados);
        return Math.pow(lados[0], 2) + Math.pow(lados[1], 2) == Math.pow(lados[2], 2);
    }

    public static double calcularAreaTrianguloRetangulo(double a, double b) {
        return (a * b) / 2;
    }
}

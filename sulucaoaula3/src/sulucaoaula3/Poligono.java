/*
 Crie um programa que leia dois valores a e b, relativos aos lados de um polígono. Em seguida leia o tipo de polígono,
 podendo ele ser um triângulo retângulo ou um retângulo propriamente dito. O programa, através de duas funções específicas, 
 deverá calcular e retornar os valores da área e do perímetro do polígono.

*/
package sulucaoaula3;

import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o tipo de polígono (triângulo retângulo ou retângulo): ");
        String tipo = scanner.next();

        if (tipo.equalsIgnoreCase("triângulo")) {
            double area = calcularAreaTriangulo(a, b);
            double perimetro = calcularPerimetroTriangulo(a, b);
            System.out.println("Área do triângulo retângulo: " + area);
            System.out.println("Perímetro do triângulo retângulo: " + perimetro);
        } else if (tipo.equalsIgnoreCase("retângulo")) {
            double area = calcularAreaRetangulo(a, b);
            double perimetro = calcularPerimetroRetangulo(a, b);
            System.out.println("Área do retângulo: " + area);
            System.out.println("Perímetro do retângulo: " + perimetro);
        } else {
            System.out.println("Tipo de polígono não reconhecido.");
        }
        
        scanner.close();
    }

    public static double calcularAreaTriangulo(double a, double b) {
        return (a * b) / 2;
    }

    public static double calcularPerimetroTriangulo(double a, double b) {
        double hipotenusa = Math.sqrt(a * a + b * b);
        return a + b + hipotenusa;
    }

    public static double calcularAreaRetangulo(double a, double b) {
        return a * b;
    }

    public static double calcularPerimetroRetangulo(double a, double b) {
        return 2 * (a + b);
    }
}

package sulucaoaula3;

import java.util.Scanner;

public class MultiplicacaoDeMatrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das dimensões das matrizes
        System.out.println("Informe o número de linhas da matriz M1:");
        int m = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz M1:");
        int n = scanner.nextInt();
        
        System.out.println("Informe o número de linhas da matriz M2:");
        int o = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz M2:");
        int p = scanner.nextInt();

        // Verificar se a multiplicação é possível
        if (n != o) {
            System.out.println("Multiplicação não é possível. O número de colunas de M1 deve ser igual ao número de linhas de M2.");
            return;
        }

        // Leitura da matriz M1
        int[][] M1 = new int[m][n];
        System.out.println("Preencha a matriz M1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                M1[i][j] = scanner.nextInt();
            }
        }

        // Leitura da matriz M2
        int[][] M2 = new int[o][p];
        System.out.println("Preencha a matriz M2:");
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < p; j++) {
                M2[i][j] = scanner.nextInt();
            }
        }

        // Calcular a matriz resultante M3
        int[][] M3 = multiplicarMatrizes(M1, M2, m, n, p);

        // Exibir a matriz resultante M3
        System.out.println("A matriz resultante da multiplicação é:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(M3[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[][] multiplicarMatrizes(int[][] M1, int[][] M2, int m, int n, int p) {
        int[][] M3 = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    M3[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }

        return M3;
    }
}

// código apresenta erro :(
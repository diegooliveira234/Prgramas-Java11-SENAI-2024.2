/*Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
        valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
        A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
        com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
        devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
        multiplicações.*/
package Lista_1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz_soma[][] = new int[4][3];
        int matriz_multiplicao[][] = new int[4][3];
        System.out.print("Digite o número A: ");
        int A = input.nextInt();
        System.out.print("Digite o número B: ");
        int B = input.nextInt();
        System.out.print("Digite o número C: ");
        int C = input.nextInt();
        System.out.print("Digite o número D: ");
        int D = input.nextInt();

        //Preencher a Matriz de Soma

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    matriz_soma[0][0] = A + B;
                    break;
                case 1:
                    matriz_soma[0][1] = A + C;
                    break;
                case 2:
                    matriz_soma[0][2] = A + D;
            }
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        matriz_soma[1][0] = A + B;
                        break;
                    case 1:
                        matriz_soma[1][1] = B + C;
                        break;
                    case 2:
                        matriz_soma[1][2] = B + D;
                }
                for (int c = 0; c < 3; c++) {
                    switch (c) {
                        case 0:
                            matriz_soma[2][0] = C + A;
                            break;
                        case 1:
                            matriz_soma[2][1] = B + C;
                            break;
                        case 2:
                            matriz_soma[2][2] = C + D;
                    }
                }
                for (int d = 0; d < 3; d++) {
                    switch (d) {
                        case 0:
                            matriz_soma[3][0] = D + A;
                            break;
                        case 1:
                            matriz_soma[3][1] = B + D;
                            break;
                        case 2:
                            matriz_soma[3][2] = C + D;
                    }
                }
                // Final do Preenchimento Matriz Soma

                //Preenchendo a matriz de multiplicação

                for (int ma = 0; ma < 3; ma++) {
                    switch (ma) {
                        case 0:
                            matriz_multiplicao[0][0] = A + B;
                            break;
                        case 1:
                            matriz_multiplicao[0][1] = A + C;
                            break;
                        case 2:
                            matriz_multiplicao[0][2] = A + D;
                    }
                    for (int mb = 0; mb < 3; mb++) {
                        switch (mb) {
                            case 0:
                                matriz_multiplicao[1][0] = A + B;
                                break;
                            case 1:
                                matriz_multiplicao[1][1] = B + C;
                                break;
                            case 2:
                                matriz_multiplicao[1][2] = B + D;
                        }
                        for (int mc = 0; mc < 3; mc++) {
                            switch (mc) {
                                case 0:
                                    matriz_multiplicao[2][0] = C + A;
                                    break;
                                case 1:
                                    matriz_multiplicao[2][1] = B + C;
                                    break;
                                case 2:
                                    matriz_multiplicao[2][2] = C + D;
                            }
                        }
                        for (int md = 0; md < 3; md++) {
                            switch (md) {
                                case 0:
                                    matriz_multiplicao[3][0] = D + A;
                                    break;
                                case 1:
                                    matriz_multiplicao[3][1] = B + D;
                                    break;
                                case 2:
                                    matriz_multiplicao[3][2] = C + D;
                            }
                        }
                        //Final do preenchimento da matriz de multiplicação

                        System.out.println("Matriz de Soma: ");
                        for (int k = 0; k < 4; k++) {
                            System.out.println(" ");
                            for (int l = 0; l < 3; l++)
                                System.out.print("  " + matriz_soma[k][l]);
                        }
                        System.out.println(" ");
                        System.out.println("Matriz de Multiplicação : ");
                        for (int w = 0; w < 4; w++) {
                            System.out.println(" ");
                            for (int r = 0; r < 3; r++)
                                System.out.print("  " + matriz_multiplicao[w][r]);
                        }
                    }
                }
            }
        }
    }
}
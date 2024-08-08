package Lista_1;

import java.util.Scanner;

/*Faça um programa para calcular o estoque médio de uma peça, sendo que:
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.*/
public class ex1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("---Dao Systems---");
        System.out.println("Informe a quantidade mínima ");
        int qtd_minima = tec.nextInt();
        System.out.println("Informe a quantidade máxima ");
        int qtd_maxima = tec.nextInt();
        int estq_medio = (qtd_maxima+qtd_minima)/2;
        System.out.printf("Estoque médio é : %d",estq_medio);


    }

}
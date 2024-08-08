/*Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
        comissão será de 5% do total da venda e que você tem os seguintes dados:
        - Identificação do vendedor
        - Código da peça
        - Preço unitário da peça
        - Quantidade vendida*/
package Lista_1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-- Só GM -- ");
        System.out.print(" Login:  ");
        int login_vendedor = input.nextInt();
        System.out.print(" Senha:  ");
        int senha_vendedor = input.nextInt();
        if((login_vendedor==1234 & senha_vendedor==1234)) {
            System.out.print(" Código da Peça:  ");
            int cod_peca=input.nextInt();
            System.out.print("Preço Unitário da Peça: ");
            double prc_peca=input.nextDouble();
            System.out.print("Quantidade vendida: ");
            int qtd_vendida = input.nextInt();
            System.out.printf("Valor a ser pago pelo cliente: R$ %.2f \n",(prc_peca*qtd_vendida));
            System.out.printf("Valor da comissão : R$ %.2f ",((prc_peca*qtd_vendida)*.05));

        }else{
            System.out.print("Login e/ou Senha incorretos ");
        }
    }
}

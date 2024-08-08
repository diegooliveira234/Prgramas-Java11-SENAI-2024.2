/*Faça um programa que:
        - Leia a cotação do dólar
        - Leia um valor em dólares
        - Converta esse valor para Real
        - Mostre o resultado*/
package Lista_1;

import java.time.Clock;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a cotação do dolár US$ : ");
        double dolar_cot = input.nextDouble();
        System.out.print("Quantos Doláres possuí ?");
        double dolares = input.nextDouble();
        double dolar_real_cot = (dolar_cot*dolares);
        System.out.printf("Você possuí R$ %.2f",dolar_real_cot);
    }
}

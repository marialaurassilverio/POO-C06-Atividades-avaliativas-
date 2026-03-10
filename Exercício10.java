package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a quantidade de ingressos INTEIRA");
        int Qtt_inteiros = entrada.nextInt();
        System.out.println("Entre com a quantidade de ingressos MEIA");
        int Qtt_Meia = entrada.nextInt();

        System.out.println("Entre com o valor de ingressos INTEIRA");
        double valor1 = entrada.nextDouble();
        System.out.println("Entre com a valor de ingressos MEIA");
        double valor2= entrada.nextDouble();

        double Total_inteiros = Qtt_inteiros*valor1;
        double Total_meia = Qtt_Meia*valor2;

        System.out.println("Valor total arrecadado com ingressos inteiros: " + Total_inteiros);
        System.out.println("Valor total arrecadado com ingressos meia: " + Total_meia);

        double soma =  Total_inteiros + Total_meia;
        System.out.println("Valor total arrecadado na sessão: " + soma);

        double media = soma/(Qtt_Meia+Qtt_inteiros);
        System.out.println("Valor medio pago por ingresso: " + media);

    }
}

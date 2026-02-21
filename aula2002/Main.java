package aula2002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao = 1;
        int soma = 0;
        int n, i = 0;

        while (opcao != 0) {
            System.out.print("Valor?: ");
            n = ler.nextInt();

            soma = soma + n;

            System.out.print("Continua?: ");
            opcao = ler.nextInt();
        } 
        System.out.print("Total: " + soma);
        System.out.print(i);

        // System.out.print("Digite sua idade: ");
        // int idade = ler.nextInt();

        // System.out.print("Digite seu salario: ");
        // Double salario = ler.nextDouble();

        // if((idade >= 18) && (salario < 5000)) {
        //     System.out.print("isento de imposto de renda");
        // } else {
        //     System.out.print("Falar no RH (IR)");
        // }

        // System.out.print("Digite um número: ");
        // int numero = ler.nextInt();
        // incremento
        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(i + " x " + numero + " = " + (i * numero));
        // }
        //decremento
        // for(int i = 10; i >= 0; i--) {
        //     System.out.println(i);
        //     if (i == 0) {
        //         System.out.println("Feliz ano novo!!!");
        //     }
        // }
    }
}
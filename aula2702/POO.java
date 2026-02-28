package aula2702;

import java.util.Scanner;

public class POO {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Lampada oL = new Lampada();

        System.out.println("Criando uma lampada");

        System.out.print("Digite a voltagem: ");
        oL.voltagem = ler.nextDouble();

        System.out.print("Digite a marca: ");
        oL.marca = ler.next();

        oL.estado = false;
        oL.imprimir();
    }
}

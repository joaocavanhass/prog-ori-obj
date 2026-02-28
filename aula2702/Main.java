package aula2702;

public class Main {
    public static void main(String[] args) {
        Lampada L = new Lampada();
        L.ligar();
        L.mostrarEstado();
        L.voltagem = (double) 127;
        L.marca = "Phillips";
        L.imprimir();
    }
}

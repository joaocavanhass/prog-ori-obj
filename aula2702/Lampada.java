package aula2702;

public class Lampada {

    Double voltagem;
    String marca;
    boolean estado;

    void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Estado: " + estado);
    }

    void desligar() {
        estado = false;
    }

    void ligar() {
        estado = true;
    }

    double retornarVoltagem() {
        return voltagem;
    }

    boolean retornarEstado() {
        return estado;
    }

    String retornarMarca() {
        return marca;
    }

    void mostrarEstado() {
        String mensagem = estado ? "acesa" : "apagada";
        System.out.println(mensagem);
    }

}
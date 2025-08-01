package br.com.alura.animal;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miando!!");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando Móveis");
    }
}

package exercicio.poo11;

public class Cavalo extends Animal {

    public Cavalo(){
    }
    public Cavalo(String nome, int idade){
        super(nome, idade);
    }
    public void deveCorrer(){
        System.out.println("Cavalo correndo!");
    }
    public void emitirSom(){
        System.out.println("Hey! Eu sou o Bojack Horseman!");
    }
}


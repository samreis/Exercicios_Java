package exercicio.poo11;

public class Zoologico {

   private Animal[] jaulas = new Animal[10];

    public Zoologico(Animal[] jaulas){
        this.jaulas = jaulas;
    }
    public Animal[] getJaulas(){
        return jaulas;
    }
}

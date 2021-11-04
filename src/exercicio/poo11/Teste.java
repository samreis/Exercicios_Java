package exercicio.poo11;

public class Teste {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Joe", 8);
        Animal cavalo = new Cavalo("Bojack Horseman", 30);
        Animal preguica = new Preguica("Carol", 25);

        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        Animal[] animais = new Animal[10];
        animais[0] = new Cachorro("Pingo", 6);
        animais[1] = new Cavalo("Stephano", 4);
        animais[2] = new Preguica("Larissa", 3);
        animais[3] = new Cachorro("Maycon", 1);
        animais[4] = new Cavalo("Mateus", 7);
        animais[5] = new Preguica("Manoela", 9);
        animais[6] = new Cachorro("José Dog", 4);
        animais[7] = new Cavalo("Pocotó", 1);
        animais[8] = new Preguica("Ruth", 6);
        animais[9] = new Cachorro("Morfeus", 2);

        Zoologico zoologico = new Zoologico(animais);

        try {
            for (Animal animal : zoologico.getJaulas()) {
                animal.emitirSom();
                Cachorro cachorro1 = new Cachorro();
                Cavalo cavalo1 = new Cavalo();
                if(animal instanceof Cachorro){
                    cachorro1.deveCorrer();
                }else if(animal instanceof Cavalo){
                    cavalo1.deveCorrer();
                }
            }
        }catch (NullPointerException npe){
            System.out.println(npe);
        }
    }

}

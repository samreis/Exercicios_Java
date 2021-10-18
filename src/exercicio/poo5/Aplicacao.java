package exercicio.poo5;
public class Aplicacao {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Maria", 18, 1.65f);
        agenda.armazenaPessoa("Jonas", 19, 1.66f);
        agenda.armazenaPessoa("Sebastião", 20, 1.67f);
        agenda.armazenaPessoa("José", 21, 1.68f);
        agenda.armazenaPessoa("João", 22, 1.69f);
        agenda.armazenaPessoa("Bia", 23, 1.70f);
        agenda.armazenaPessoa("Joaquina", 24, 1.71f);
        agenda.armazenaPessoa("Silveira", 25, 1.72f);
        agenda.armazenaPessoa("Joana", 26, 1.73f);
        agenda.armazenaPessoa("Tamara", 27, 1.74f);

        agenda.removePessoa("Maria");

        agenda.buscaPessoa("Maria");

        agenda.imprimeAgenda();

        agenda.imprimePessoa(9);
    }
}
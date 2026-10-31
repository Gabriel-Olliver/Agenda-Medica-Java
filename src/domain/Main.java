package domain;

public class Main {
    public static void main(String[] args) {

        Medico Gabriel = new Medico("Gabriel", "Cirurgião");
        Medico Leidiane = new Medico("Leidiane", "Terapeuta");

        Paciente p1 = new Paciente("Nome: Ana","Cpf: 000", "Idade: 18", "Tel: 0123");
        Paciente p2 = new Paciente("Nome: Arthur", "Cpf: 111", "Idade: 19", "Tel: 456");
        Paciente p3 = new Paciente("Nome: Pedro", "Cpf: 222", "Idade: 30", "Tel: 789");
        Paciente p4 = new Paciente("Nome: Olivanio", "Cpf: 333", "Idade: 20", "Tel: 101112");

        Agenda agenda1 = new Agenda(Gabriel);
        agenda1.setData("01/02/2029");
        agenda1.adicionar(p2);
        agenda1.adicionar(p4);
        agenda1.apresentarListaDePacientes();

        Agenda agenda2 = new Agenda(Leidiane);
        agenda2.setData("01/08/2029");
        agenda2.adicionar(p1);
        agenda2.adicionar(p3);
        agenda2.apresentarListaDePacientes();

        agenda2.remover("Cpf: 222");


    }
}
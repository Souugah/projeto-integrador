package clinicavet;



public class Clinicavet {

    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario(1, "João da Silva", "(11) 9999-9999");
        Animal meuAnimal = new Animal(1, "Bolinha", "Cão", 2, 10.5);
        Veterinario veterinario = new Veterinario(1, "Dr. João", "(11) 1234-5678", "Clínico Geral");
        
        Consulta consulta = new Consulta(1, "19/04/2023", "14:00", meuAnimal, veterinario, proprietario);
        consulta.exibirDadosConsulta();
        
        consulta.setId(2);
        consulta.setData("20/04/2023");
        consulta.setHora("10:30");
        
        Animal outroAnimal = new Animal(2, "Mimi", "Gato", 1, 5.0);
        Proprietario outroProprietario = new Proprietario(2, "Maria da Silva", "(11) 8888-8888");
        Veterinario outroVeterinario = new Veterinario(2, "Dra. Ana", "(11) 2345-6789", "Dermatologista");
        
        Consulta outraConsulta = new Consulta(2, "21/04/2023", "16:00", outroAnimal, outroVeterinario, outroProprietario);
        outraConsulta.exibirDadosConsulta();
    }
}

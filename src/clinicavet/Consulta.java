package clinicavet;





public class Consulta {
     int id;
     String data;
     String hora;
    Animal animal;
   Veterinario veterinario;
   Proprietario proprietario;
    private Proprietario Proprietario;

    // Construtor
    public Consulta(int id, String data, String hora, Animal MeuAnimal, Veterinario veterinario, Proprietario Proprietario) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.animal = MeuAnimal;
        this.veterinario = veterinario;
        this.Proprietario = Proprietario;
    }

    

    // Métodos de acesso aos atributos
    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Veterinario getVeterinario() {
    return veterinario;
}

public Proprietario getProprietario() {
    return Proprietario;
}

// Método para exibir dados da consulta
public void exibirDadosConsulta() {
    System.out.println("ID da consulta: " + id);
    System.out.println("Data: " + data);
    System.out.println("Hora: " + hora);
    System.out.println("Dados do animal:");
    animal.exibirDadosAnimal();
    System.out.println("Dados do veterinário:");
    veterinario.exibirDadosVeterinario();
    System.out.println("Dados do Cliente:");
    Proprietario.exibirDadosProprietario();

} 
public void setId(int id) {
    this.id = id;
}

public void setData(String data) {
    this.data = data;
}

public void setHora(String hora) {
    this.hora = hora;
}

public void setMeuAnimal(Animal animal) {
    this.animal = animal;
}

public void setVeterinario(Veterinario veterinario) {
    this.veterinario = veterinario;
}

public void setProprietario(Proprietario Proprietario) {
    this.Proprietario = Proprietario;
}
}
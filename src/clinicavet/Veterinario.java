package clinicavet;

public class Veterinario {
     int id;
    String nome;
     String telefone;
     String especialidade;

    // Construtor
    public Veterinario(int id, String nome, String telefone, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    // Métodos de acesso aos atributos
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    
    }
   public void exibirDadosVeterinario() {
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Telefone: " + telefone);
    System.out.println("Especialidade: " + especialidade);

    
   }   

}
package clinicavet;

public class Proprietario {
    int id;
    String nome;
    String telefone;

    
    public Proprietario(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

   
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    
    public void exibirDadosProprietario() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }

    
    }


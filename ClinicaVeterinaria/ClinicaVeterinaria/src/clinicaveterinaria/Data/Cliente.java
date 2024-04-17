package clinicaveterinaria.Data;

/**
* @author GABRIELA
* @version 1.0
* @since Primeira versão
*/
public class Cliente {
    private int id; 
    private String nome;
    private String endereco;
    private String cpf;
    private String bairro;
    private String estado;
    private String telefone;
   

    
    public Cliente(String nome, String endereco, String cpf, String bairro, String estado, String telefone) {
       
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.bairro = bairro;
        this.estado = estado;
        this.telefone = telefone;
       
    }
    

    // Métodos getters e setters para os atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}

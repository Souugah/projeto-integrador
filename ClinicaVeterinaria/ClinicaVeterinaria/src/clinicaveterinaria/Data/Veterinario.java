/**
* @author GABRIELA
* @version 1.0
* @since Primeira versão
*/
package clinicaveterinaria.Data;

public class Veterinario {
    private String nome;
    private String crmv;
    private String cpf;
    private String telefone;

    public Veterinario(String nome, String crmv, String cpf, String telefone) {
        this.nome = nome;
        this.crmv = crmv;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Métodos getters e setters para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}


package clinicavet;

import java.util.Date;

public class Paciente {
     String nome;
     String especie;
    String raca;
     Date dataNascimento;
     double peso;
     String historico;
     String contatoProprietario;

    public Paciente(String nome, String especie, String raca, Date dataNascimento, double peso, String historico, String contatoProprietario) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.historico = historico;
        this.contatoProprietario = contatoProprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getContatoProprietario() {
        return contatoProprietario;
    }

    public void setContatoProprietario(String contatoProprietario) {
        this.contatoProprietario = contatoProprietario;
    }
}

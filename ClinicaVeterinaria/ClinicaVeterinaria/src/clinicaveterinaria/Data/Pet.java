/**
* @author GABRIELA
* @version 1.0
* @since Primeira versão
*/
package clinicaveterinaria.Data;

public class Pet {
    private int id;
    private String nome;
    private String raca;
    private String especie;
    private String dataNascimento;
    private String sexo;
    private String id_cliente;

    public Pet(String nome, String raca, String especie, String dataNascimento, String sexo, String id_cliente) {
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.id_cliente = id_cliente;
    }

   

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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }
   

    
    

    
}

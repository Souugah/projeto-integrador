public class Pet {
    private int id;
    private String nome;
    private String raca;
    private String especie;
    private String dataNascimento;
    private String sexo;
    private int idCliente; // Associação com o Cliente

    public Pet(String nome, String raca, String especie, String dataNascimento, String sexo, int idCliente) {
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.idCliente = idCliente;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
}

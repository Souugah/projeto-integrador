
package clinicavet;


public class ConsultaArmazenamento {
    int id;
    String data;
    String hora;
    Animal animal;
    Veterinario veterinario;
    Proprietario Proprietario;

    public ConsultaArmazenamento(int id, String data, String hora, Animal MeuAnimal, Veterinario veterinario, Proprietario Proprietario) {
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

    public void setProprietario(Proprietario Cliente) {
        this.Proprietario = Cliente;
    }
}



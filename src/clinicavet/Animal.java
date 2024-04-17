
package clinicavet;

public class Animal {
     int id;
     String nome;
     String especie;
     int idade;
     double peso;

    // Construtor
    public Animal(int id, String nome, String especie, int idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    // Métodos de acesso aos atributos
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    
   public void exibirDadosAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }

    // Sobrecarga do método exibirDadosAnimal() para mostrar também o ID do animal
    public void exibirDadosAnimal(boolean mostrarId) {
        if (mostrarId) {
            System.out.println("ID: " + id);
        }
        exibirDadosAnimal();
    }
}

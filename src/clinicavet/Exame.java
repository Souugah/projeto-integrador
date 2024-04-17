package clinicavet;

public class Exame {
    private String nome;
    private String resultados;

    public Exame(String nome, String resultados) {
        this.nome = nome;
        this.resultados = resultados;
    }

    public String getNome() {
        return nome;
    }

    public String getResultados() {
        return resultados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
}

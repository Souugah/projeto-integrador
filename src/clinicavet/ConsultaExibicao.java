
package clinicavet;

public class ConsultaExibicao {
    ConsultaArmazenamento consultaArmazenada;

    public ConsultaExibicao(ConsultaArmazenamento consultaArmazenada) {
        this.consultaArmazenada = consultaArmazenada;
    }

    // Método para exibir dados da consulta
    public void exibirDadosConsulta() {
        System.out.println("ID da consulta: " + consultaArmazenada.getId());
        System.out.println("Data: " + consultaArmazenada.getData());
        System.out.println("Hora: " + consultaArmazenada.getHora());
        System.out.println("Dados do animal:");
        consultaArmazenada.animal.exibirDadosAnimal();
        System.out.println("Dados do veterinário:");
        consultaArmazenada.veterinario.exibirDadosVeterinario();
        System.out.println("Dados do proprietário:");
        consultaArmazenada.Proprietario.exibirDadosProprietario();
    }
}
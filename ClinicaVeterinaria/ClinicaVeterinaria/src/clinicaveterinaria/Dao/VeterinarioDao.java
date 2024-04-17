/**
* @author GABRIELA
* @version 1.0
* @since Primeira versão
*/
package clinicaveterinaria.Dao;


import clinicaveterinaria.Data.Veterinario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioDao {
    private Connection conexao;

    public VeterinarioDao(Connection conexao) {
        this.conexao = conexao;
    }

    public void adicionarVeterinario(Veterinario veterinario) {
        String sql = "INSERT INTO veterinario (nome, crmv, cpf, telefone) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, veterinario.getNome());
            stmt.setString(2, veterinario.getCrmv());
            stmt.setString(3, veterinario.getCpf());
            stmt.setString(4, veterinario.getTelefone());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira apropriada para sua aplicação
        }
    }

    public List<Veterinario> listarVeterinarios() {
        List<Veterinario> veterinarios = new ArrayList<>();
        String sql = "SELECT * FROM veterinario";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Veterinario veterinario = new Veterinario(
                        rs.getString("nome"),
                        rs.getString("crmv"),
                        rs.getString("cpf"),
                        rs.getString("telefone")
                );

                veterinarios.add(veterinario);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira apropriada para sua aplicação
        }

        return veterinarios;
    }

    public void atualizarVeterinario(Veterinario veterinario) {
        String sql = "UPDATE veterinario SET nome=?, crmv=?, cpf=?, telefone=? WHERE crmv=?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, veterinario.getNome());
            stmt.setString(2, veterinario.getCrmv());
            stmt.setString(3, veterinario.getCpf());
            stmt.setString(4, veterinario.getTelefone());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira apropriada para sua aplicação
        }
    }

   
}

package clinicaveterinaria.Dao;

/**
* @author GABRIELA
* @version 1.0
* @since Primeira versão
*/

import clinicaveterinaria.Data.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    private Connection conexao;

    public ClienteDao(Connection conexao) {
        this.conexao = conexao;
    }
    

    
    public void adicionarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, endereco, cpf, bairro, estado, telefone) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getBairro());
            stmt.setString(5, cliente.getEstado());
            stmt.setString(6, cliente.getTelefone());
            
            stmt.executeUpdate();
            
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                cliente.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira semelhante para sua aplicação
        }
    }

    // Método para recuperar todos os clientes do banco de dados
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        
        String sql = "SELECT * FROM cliente";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("cpf"),
                    rs.getString("bairro"),
                    rs.getString("estado"),
                    rs.getString("telefone")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira específica para sua aplicação
        }

        return clientes;
    }

    // Método para atualizar um cliente no banco de dados
    public void atualizarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET nome=?, endereco=?, cpf=?, bairro=?, estado=?, telefone=? WHERE id=?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getBairro());
            stmt.setString(5, cliente.getEstado());
            stmt.setString(6, cliente.getTelefone());
            stmt.setInt(7, cliente.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira diferente para sua aplicação
        }
    }

   
    
}

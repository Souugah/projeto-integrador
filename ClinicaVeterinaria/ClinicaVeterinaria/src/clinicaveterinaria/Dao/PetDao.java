/**
* @author GABRIELA
* @version 1.0
* @since Primeira versão
*/

package clinicaveterinaria.Dao;


import clinicaveterinaria.Data.Pet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PetDao {
    private Connection conexao;

    public PetDao(Connection conexao) {
        this.conexao = conexao;
    }

    public void adicionarPet(Pet pet) {
        String sql = "INSERT INTO pet (nome, raca, especie, data_nascimento, sexo, id_cliente) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getRaca());
            stmt.setString(3, pet.getEspecie());
            stmt.setString(4, pet.getDataNascimento());
            stmt.setString(5, pet.getSexo());
            stmt.setString(6, pet.getId_cliente());
           

            stmt.executeUpdate();

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                pet.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira apropriada para sua aplicação
        }
    }

    
    
    public List<Pet> listarPets() {
        List<Pet> pets = new ArrayList<>();
        String sql = "SELECT * FROM pet";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Pet pet = new Pet(
                        
                        
                        rs.getString("nome"),
                        rs.getString("raca"),
                        rs.getString("especie"),
                        rs.getString("data_nascimento"),
                        rs.getString("sexo"),
                        rs.getString("id_cliente")
                );

                pets.add(pet);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira apropriada para sua aplicação
        }

        return pets;
    }

    public void atualizarPet(Pet pet) {
        String sql = "UPDATE pet SET nome=?, raca=?, especie=?, data_nascimento=?, sexo=?, id_cliente=? WHERE id=?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getRaca());
            stmt.setString(3, pet.getEspecie());
            stmt.setString(4, pet.getDataNascimento());
            stmt.setString(5, pet.getSexo());           
            stmt.setInt(6, pet.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Trate a exceção de maneira apropriada para sua aplicação
        }
    }

   
}

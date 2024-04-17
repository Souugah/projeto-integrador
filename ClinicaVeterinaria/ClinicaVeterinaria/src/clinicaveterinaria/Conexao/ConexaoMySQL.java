/**
* @author GABRIELA
* @version 1.0
* @since Primeira versão
*/

package clinicaveterinaria.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private Connection conexao; // Variável de conexão que será preenchida
         
    
    public ConexaoMySQL() {
        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Configurar a URL de conexão com o banco de dados
            String url = "jdbc:mysql://localhost/clinicaveterinariabd";

            // Iniciar a conexão com o banco de dados
            conexao = DriverManager.getConnection(url, "root", "123456");

            System.out.println("Conexão bem-sucedida!");

        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    
     public Connection getConnection() {
        return conexao;
            }
        
         
}

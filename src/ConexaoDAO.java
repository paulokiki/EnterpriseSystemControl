
import java.sql.*;

public class ConexaoDAO {

    public static Connection connSistema;

    public static void abreConexao() throws Exception {
        try {
//tratamento de erro
            Class.forName("com.mysql.jdbc.Driver"); // reconhecendo biblioteca mysql
            connSistema = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsistema", "root", "");
        } catch (Exception erro) {
            throw new Exception(erro.getMessage());
        }
    }

    public static void fecharConexao() throws Exception {
        try {

            connSistema.close();
        } catch (Exception erro) {
            throw new Exception(erro.getMessage());
        }
    }
}

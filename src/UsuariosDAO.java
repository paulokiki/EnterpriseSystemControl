
import java.sql.*;

public class UsuariosDAO {

    public static Statement stUsuarios;
    public static ResultSet rsUsuarios;

    public static int validarUsuario(String tmpUsuario, String tmpSenha) throws Exception {
        int permissao = 0;
        try {
            ConexaoDAO.abreConexao();

            String sqlLogin = "select permissao_usuario from usuarios where nome_usuario like '" + tmpUsuario + "' and senha_usuario like '" + tmpSenha + "'";
            stUsuarios = ConexaoDAO.connSistema.createStatement();
            //executar comando sql
            rsUsuarios = stUsuarios.executeQuery(sqlLogin);

            if (rsUsuarios.next()) { // se houver registros
                // atribuindo pérmissao encontrada bd
                permissao = rsUsuarios.getInt("permissao_usuario");

            }

            ConexaoDAO.fecharConexao();

        } catch (Exception erro) {
            throw new Exception(erro.getMessage());
        }

        return permissao;
    }
}

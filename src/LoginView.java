
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginView extends JInternalFrame implements ActionListener {

    public static Container ctnlogin;
    public static JLabel lblUsuario, lblSenha;
    public static JTextField txtUsuario;
    public static JPasswordField pwdSenha;
    public static JButton btnLogin;

    public LoginView() {
        super("Acesso ao sistema");
        ctnlogin = new Container();
        ctnlogin.setLayout(null);
        //this.setClosable(true);

        this.add(ctnlogin);

        lblUsuario = new JLabel("Nome de usuario");
        lblUsuario.setBounds(20, 15, 120, 20);
        ctnlogin.add(lblUsuario);

        lblSenha = new JLabel("Senha");
        lblSenha.setBounds(20, 75, 120, 20);
        ctnlogin.add(lblSenha);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(20, 40, 300, 20);
        ctnlogin.add(txtUsuario);

        pwdSenha = new JPasswordField();
        pwdSenha.setBounds(20, 100, 300, 20);
        ctnlogin.add(pwdSenha);

        btnLogin = new JButton("Acessar Sistema");
        btnLogin.addActionListener(this); // ativar botão
        btnLogin.setBounds(20, 130, 300, 25);
        ctnlogin.add(btnLogin);

        this.setLocation(320, 150);
        this.setSize(350, 200);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnLogin) {
            String usuario = txtUsuario.getText();
            String senha = pwdSenha.getText();
            try {

                int permissao = UsuariosDAO.validarUsuario(usuario, senha);
                if (permissao == 0) {
                    JOptionPane.showMessageDialog(null, "Dados invalidos");
                } else {
                    JOptionPane.showMessageDialog(null, "Acesso concedido");
                }
            } catch (Exception erro) {

                JOptionPane.showMessageDialog(null, erro.getMessage());

            }

        }
    }

}

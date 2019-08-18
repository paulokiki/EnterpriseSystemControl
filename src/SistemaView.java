
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SistemaView extends JFrame implements ActionListener {

    //DECLARAÇÃO DE OBJETOS
    public static Container ctnPrincipal, ctnTopo, ctnMenu;
    public static JLabel lblBanner;
    public static JDesktopPane dskJanelas;

    public static JButton btnMenu[];

    public SistemaView() {
        super("Sistema de Gerenciamento");
        //INSTANCIA DE CONFIGURAÇÃO

        ctnPrincipal = new Container();
        ctnPrincipal.setLayout(new BorderLayout());
        this.add(ctnPrincipal); //ADD PRINCIPAL Á JANELA

        ctnTopo = new Container();
        ctnTopo.setLayout(new GridLayout(2, 1));
        ctnPrincipal.add(ctnTopo, BorderLayout.NORTH);

        lblBanner = new JLabel("banner");
        ctnTopo.add(lblBanner); // ADD BANNER

        ctnMenu = new Container();
        ctnMenu.setLayout(new GridLayout(2, 4));
        ctnTopo.add(ctnMenu);

        dskJanelas = new JDesktopPane();
        ctnPrincipal.add(dskJanelas, BorderLayout.CENTER);

        btnMenu = new JButton[8];
        String sMenu[] = {"CLIENTES", "PRODUTOS", "FUNCIONARIOS", "FORNECEDORES", "VENDAS", "CONTAS", "CHAMADOS", "USUARIOS"};
       
        for (int i = 0; i < btnMenu.length; i++) {
            btnMenu[i] = new JButton(sMenu[i]);
            btnMenu [i].setEnabled(false);
            ctnMenu.add(btnMenu[i]);
            

        }
        dskJanelas.add(new LoginView());

        // CONFIGURAÇÕES DA JANELA
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1024, 768);
        //this.show(true);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Janela extends JFrame {
    private final static int dimH = 300;
    private static int dimV = 300;

    public Janela () {
        setSize(dimH, dimV);
        setTitle("RockStar Inc");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*JPanel painel = new JPanel();
        JLabel rotulo1 = new JLabel("Painel 1");
        painel.setBackground(Color.lightGray);
        painel.add(rotulo1);*/

        // Carrega a imagem de fundo (imagem guardada na pasta do projeto atual, dentro da pasta 'src')
        ImageIcon imageIcon = new ImageIcon("src/Icon.jpeg");
        Image imagemDeFundo = imageIcon.getImage();

        // Cria um painel personalizado com a imagem de fundo
        ImagemDeFundo painel = new ImagemDeFundo(imagemDeFundo);

        JPanel painel2 = new JPanel();
        //painel2.setBackground(Color.red);
        JLabel rotulo2 = new JLabel("Painel 2");
        painel2.add(rotulo2);
        add(painel2);


        //Definir o layout dos painéis , organizando-os numa grelha (Dimensões fixas)
        //setLayout(new GridLayout(1,2));

        // Definir layout manualmente (Dimensões personalizadas)
       /* setLayout(null);
        painel.setBounds(10,10,130,200);
        painel2.setBounds(150,10,130,250);*/

        //Dimensões proporcionais à janela
        //Para organizar desta forma devo retirar o 'add(painel)' que está no final do código, se não adiciona sem ter em conta a proporção

        /*setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5; // 50% do espaço horizontal para cada painel
       // gbc.weighty = 0.5; // 50% do espaço vertical para cada painel
        // Adiciona o primeiro painel
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(painel, gbc);

        // Adiciona o segundo painel
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(painel2, gbc);
*/

        Image icon = new ImageIcon("src/Icon.jpeg").getImage();
        setIconImage(icon);

        //Criar botões
        JButton login = new JButton("Login");
        JButton signUp = new JButton("Sign Up");
        JButton exit = new JButton("Exit");

        // Cria um painel para os botões usando um FlowLayout
        JPanel botoesPanel = new JPanel();
        botoesPanel.setOpaque(false);
        botoesPanel.add(login);
        botoesPanel.add(signUp);
        botoesPanel.add(exit);

        // Obtém o contentor de conteúdo da janela e define o layout como BorderLayout
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());

        // Adiciona o painel de fundo no centro e o painel de botões no sul
        pane.add(painel, BorderLayout.CENTER);
        pane.add(botoesPanel, BorderLayout.SOUTH);

        //Adiciona ação de sair da app ao botão exit
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        //Adiciona ação de mudar do painel (Rockstar) para o painel 2 (a cinzento), com o botão login
        login.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                painel.setVisible(false);
                painel2.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        //Adiciona ação de mudar do painel 2 (a cinzento) para o painel (Rockstar), com o botão Sign Up
        signUp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                painel.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        //add(painel);
        //add(painel2);
        setVisible(true);

    }
}
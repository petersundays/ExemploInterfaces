import javax.swing.*;

public class FramePrincipal extends JFrame {

    public FramePrincipal() {
        super("Rockstar");

        PainelPrincipal painelPrincipal = new PainelPrincipal();

        add(painelPrincipal);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}


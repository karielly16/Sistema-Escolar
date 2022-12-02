
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

/**
 * User Registration using Swing
 * @author javaguides.net
 *
 */
public class Disciplinas extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField disciplina;
    private JButton btnSalvar;
    private JButton btnExcluir;
    private JButton btnSair;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Disciplinas frame = new Disciplinas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public Disciplinas() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Cadastro de Disciplina");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel disciplinLabel = new JLabel("Disciplina");
        disciplinLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        disciplinLabel.setBounds(58, 170, 99, 43);
        contentPane.add(disciplinLabel);

        disciplina = new JTextField();
        disciplina.setFont(new Font("Tahoma", Font.PLAIN, 32));
        disciplina.setBounds(214, 170, 723, 50);
        contentPane.add(disciplina);
        disciplina.setColumns(10);
        
        btnSalvar = new JButton("Salvar");
        btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnSalvar.setBounds(58, 440, 159, 70);
        contentPane.add(btnSalvar);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

               Disciplina nova = new Disciplina();
               nova.nome = disciplina.getText();
            
     
               Database.inserir(nova);
            }
        });           


        btnExcluir = new JButton("Excluir");
        btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnExcluir.setBounds(500, 440, 159, 70);
        contentPane.add(btnExcluir);
        
        btnSair = new JButton("Sair");
        btnSair.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnSair.setBounds(777, 440, 159, 70);
        contentPane.add(btnSair);
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();	
            }
        });
    }

}
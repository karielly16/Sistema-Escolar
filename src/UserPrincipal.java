
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;

import javax.swing.ImageIcon;
// import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JOptionPane;
import javax.swing.JPanel;
// import javax.swing.JPasswordField;
// import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * User Registration using Swing
 * 
 * @author javaguides.net
 *
 */
public class UserPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    // private JTextField firstname;
    // private JTextField lastname;
    // private JTextField email;
    // private JTextField username;
    // private JTextField mob;
    // private JPasswordField passwordField;
    // private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserPrincipal frame = new UserPrincipal();
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

    public UserPrincipal() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(UserPrincipal.class.getResource("/img/coruj.png")));
        lblNewLabel_1.setBounds(165, 100, 605, 315);
        contentPane.add(lblNewLabel_1);

        // JLabel lblNewUserRegister = new JLabel("New User Register");
        // lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        // lblNewUserRegister.setBounds(362, 52, 325, 50);
        // contentPane.add(lblNewUserRegister);

        // JLabel lblName = new JLabel("First name");
        // lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        // lblName.setBounds(58, 152, 99, 43);
        // contentPane.add(lblName);

        JLabel lblAlunos = new JLabel("Alunos");
        lblAlunos.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAlunos.setBounds(542, 73, 99, 29);
        contentPane.add(lblAlunos);
        lblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastroAlunos TelaAlunos = new CadastroAlunos();
                TelaAlunos.setVisible(true);
                this.setVisible(false);
            }

            private void setVisible(boolean b) {
            }
        });

        JLabel lblProfessores = new JLabel("Professores");
        lblProfessores.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblProfessores.setBounds(542, 159, 99, 29);
        contentPane.add(lblProfessores);
        lblProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserProfessores TelaProfessores = new UserProfessores();
                TelaProfessores.setVisible(true);
                this.setVisible(false);
            }

            private void setVisible(boolean b) {
            }
        });

        JLabel lblTurmas = new JLabel("Turmas");
        lblTurmas.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTurmas.setBounds(542, 245, 99, 24);
        contentPane.add(lblTurmas);
        lblTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Turmas TelaTurmas = new Turmas();
                TelaTurmas.setVisible(true);
                this.setVisible(false);
            }

            private void setVisible(boolean b) {
            }
        });

        JLabel lblDisciplina = new JLabel("Disciplinas");
        lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblDisciplina.setBounds(542, 329, 139, 26);
        contentPane.add(lblDisciplina);
        lblDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Disciplinas TelaDisciplinas = new Disciplinas();
                TelaDisciplinas.setVisible(true);
                this.setVisible(false);
            }

            private void setVisible(boolean b) {
            }
        });

        JLabel lblMatricula = new JLabel("Matricula");
        lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMatricula.setBounds(542, 415, 139, 26);
        contentPane.add(lblMatricula);
        lblMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Matricula TelaMatricula = new Matricula();
                TelaMatricula.setVisible(true);
                this.setVisible(false);
            }

            private void setVisible(boolean b) {
            }
        });
    }
}

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
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
public class Matricula extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField pesquisaaluno;
    private JTextField aluno;
    private JTextField classe;
    private JTextField situacao;
    private JTextField codigo;
    private JButton btnPesquisa;
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
                    Matricula frame = new Matricula();
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

    public Matricula() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        pesquisaaluno = new JTextField();
        pesquisaaluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        pesquisaaluno.setBounds(55, 20, 700, 40);
        contentPane.add(pesquisaaluno);
        pesquisaaluno.setColumns(10);

        btnPesquisa = new JButton("");
        // btnNewButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         String aluno = aluno.getText();
        //         String classe = classe.getText();
        //         String situacaoId = situacao.getText();
        //         String userName = username.getText();
        //         String mobileNumber = mob.getText();
        //         int len = mobileNumber.length();
        //         String password = passwordField.getText();

        //         String msg = "" + aluno;
        //         msg += " \n";
        //         if (len != 10) {
        //             JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
        //         }

        //         try {
        //             Connection connection = DriverManager.getConnection("jdbc:postgresql://192.168.1.120/adsdb", "ads", "ads123");

        //             String query = "INSERT INTO account values('" + aluno + "','" + classe + "','" + userName + "','" +
        //                 password + "','" + situacaoId + "','" + mobileNumber + "')";

        //             Statement sta = connection.createStatement();
        //             int x = sta.executeUpdate(query);
        //             if (x == 0) {
        //                 JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
        //             } else {
        //                 JOptionPane.showMessageDialog(btnNewButton,
        //                     "Welcome, " + msg + "Your account is sucessfully created");
        //             }
        //             connection.close();
        //         } catch (Exception exception) {
        //             exception.printStackTrace();
        //         }
        //     }
        // });
        btnPesquisa.setIcon(new ImageIcon(UserPrincipal.class.getResource("/img/lupa.png")));
        btnPesquisa.setBounds(800, 20, 59, 40);
        contentPane.add(btnPesquisa);

        JLabel lblBoletim = new JLabel("Emitir Boletim");
        lblBoletim.setIcon(new ImageIcon(UserPrincipal.class.getResource("/img/diploma.png")));
        lblBoletim.setBounds(800, 150, 180, 80);
        contentPane.add(lblBoletim);
        

        JLabel lblcodigo = new JLabel("Código");
        lblcodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblcodigo.setBounds(58, 80, 99, 29);
        contentPane.add(lblcodigo);

        JLabel lblAluno = new JLabel("Aluno");
        lblAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAluno.setBounds(58, 152, 99, 43);
        contentPane.add(lblAluno);

        JLabel lblClasse = new JLabel("Classe");
        lblClasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblClasse.setBounds(58, 243, 110, 29);
        contentPane.add(lblClasse);

        JLabel lblSituacao = new JLabel("Situação");
        lblSituacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSituacao.setBounds(58, 324, 124, 36);
        contentPane.add(lblSituacao);

        aluno = new JTextField();
        aluno.setFont(new Font("Tahoma", Font.PLAIN, 32));
        aluno.setBounds(214, 155, 480, 40);
        contentPane.add(aluno);
        aluno.setColumns(10);

        classe = new JTextField();
        classe.setFont(new Font("Tahoma", Font.PLAIN, 32));
        classe.setBounds(214, 235, 228, 40);
        contentPane.add(classe);
        classe.setColumns(10);

        situacao = new JTextField();

        situacao.setFont(new Font("Tahoma", Font.PLAIN, 32));
        situacao.setBounds(214, 320, 228, 40);
        contentPane.add(situacao);
        situacao.setColumns(10);

        codigo = new JTextField();
        codigo.setFont(new Font("Tahoma", Font.PLAIN, 32));
        codigo.setBounds(214, 80, 480, 40);
        contentPane.add(codigo);
        codigo.setColumns(10);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnSalvar.setBounds(58, 440, 159, 70);
        contentPane.add(btnSalvar);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

               Matriculas matri = new Matriculas();
               matri.codigo = codigo.getText();
               matri.aluno = aluno.getText();
               matri.classe = classe.getText();
               matri.situacao = situacao.getText();
               
     
               Database.inserir(matri);
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
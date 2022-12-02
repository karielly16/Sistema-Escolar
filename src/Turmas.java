
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
 * 
 * @author javaguides.net
 *
 */
public class Turmas extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField pesquisaaluno;
    private JTextField nome;
    private JTextField curso;
    private JTextField serie;
    private JTextField codigo;
    private JTextField pletivo;
    private JButton btnPesquisa;
    private JButton btnSalvar;
    private JButton btnExcluir;
    private JButton btnSair;
    private JTextField turno;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Turmas frame = new Turmas();
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

    public Turmas() {
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
        //         String curso = curso.getText();
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

        //             String query = "INSERT INTO account values('" + aluno + "','" + curso + "','" + userName + "','" +
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

        JLabel lblNome = new JLabel("Nome");
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNome.setBounds(58, 152, 99, 29);
        contentPane.add(lblNome);

        JLabel lblcurso = new JLabel("Curso");
        lblcurso.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblcurso.setBounds(58, 243, 110, 29);
        contentPane.add(lblcurso);

        JLabel lblSituacao = new JLabel("Série");
        lblSituacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSituacao.setBounds(58, 324, 124, 29);
        contentPane.add(lblSituacao);

        JLabel lblPLetivo = new JLabel("Periodo Letivo");
        lblPLetivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPLetivo.setBounds(400, 243, 110, 29);
        contentPane.add(lblPLetivo);

        JLabel lblTurno = new JLabel("Turno");
        lblTurno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTurno.setBounds(400, 324, 110, 29);
        contentPane.add(lblTurno);

        nome = new JTextField();
        nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
        nome.setBounds(130, 155, 625, 40);
        contentPane.add(nome);
        nome.setColumns(10);

        curso = new JTextField();
        curso.setFont(new Font("Tahoma", Font.PLAIN, 20));
        curso.setBounds(130, 235, 228, 40);
        contentPane.add(curso);
        curso.setColumns(10);

        serie = new JTextField();
        serie.setFont(new Font("Tahoma", Font.PLAIN, 20));
        serie.setBounds(130, 320, 228, 40);
        contentPane.add(serie);
        serie.setColumns(10);

        codigo = new JTextField();
        codigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        codigo.setBounds(130, 80, 625, 40);
        contentPane.add(codigo);
        codigo.setColumns(10);

        pletivo = new JTextField();
        pletivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        pletivo.setBounds(527, 235, 228, 40);
        contentPane.add(pletivo);
        pletivo.setColumns(10);

        turno = new JTextField();
        turno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        turno.setBounds(527, 320, 228, 40);
        contentPane.add(turno);
        turno.setColumns(10);

        btnSalvar = new JButton("Novo");
        btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnSalvar.setBounds(58, 440, 159, 70);
        contentPane.add(btnSalvar);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

               Turma turm = new Turma();
               turm.codigo = codigo.getText();
               turm.nome = nome.getText();
               turm.curso = curso.getText();
               turm.serie = serie.getText();
               turm.periodo = pletivo.getText();
               turm.turno= turno.getText();
               
     
               Database.inserir(turm);
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
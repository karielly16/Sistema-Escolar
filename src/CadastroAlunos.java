
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
public class CadastroAlunos extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nomecompleto;
    private JTextField cpf;
    private JTextField idade;
    private JTextField turma;
    private JTextField serie;
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
                    CadastroAlunos frame = new CadastroAlunos();
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

    public CadastroAlunos() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Cadastro de Aluno");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("Nome Completo");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblCPF = new JLabel("CPF");
        lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCPF.setBounds(58, 243, 110, 29);
        contentPane.add(lblCPF);

        JLabel Idade = new JLabel("Idade");
        Idade.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Idade.setBounds(58, 324, 124, 36);
        contentPane.add(Idade);

        nomecompleto = new JTextField();
        nomecompleto.setFont(new Font("Tahoma", Font.PLAIN, 32));
        nomecompleto.setBounds(214, 151, 723, 50);
        contentPane.add(nomecompleto);
        nomecompleto.setColumns(10);

        cpf = new JTextField();
        cpf.setFont(new Font("Tahoma", Font.PLAIN, 32));
        cpf.setBounds(214, 235, 228, 50);
        contentPane.add(cpf);
        cpf.setColumns(10);

        idade = new JTextField();
        idade.setFont(new Font("Tahoma", Font.PLAIN, 32));
        idade.setBounds(214, 320, 228, 50);
        contentPane.add(idade);
        idade.setColumns(10);

        JLabel lblSerie = new JLabel("Série");
        lblSerie.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSerie.setBounds(542, 245, 99, 24);
        contentPane.add(lblSerie);

        JLabel lblTurma = new JLabel("Turma");
        lblTurma.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTurma.setBounds(542, 329, 139, 26);
        contentPane.add(lblTurma);

        turma = new JTextField();
        turma.setFont(new Font("Tahoma", Font.PLAIN, 32));
        turma.setBounds(707, 320, 228, 50);
        contentPane.add(turma);
        turma.setColumns(10);

        serie = new JTextField();
        serie.setFont(new Font("Tahoma", Font.PLAIN, 32));
        serie.setBounds(707, 235, 228, 50);
        contentPane.add(serie);
        serie.setColumns(10);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnSalvar.setBounds(58, 440, 159, 70);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               Pessoa aluno = new Pessoa();
               aluno.nome = nomecompleto.getText();
               aluno.cpf = cpf.getText();
               aluno.idade = idade.getText();
               aluno.serie = serie.getText();
               aluno.turma = turma.getText();
            
               Database.inserir(aluno);
            }
        });        
        contentPane.add(btnSalvar);



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
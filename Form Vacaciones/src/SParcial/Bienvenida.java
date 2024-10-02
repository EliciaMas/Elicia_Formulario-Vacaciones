package SParcial;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bienvenida extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton BtnIngresar;
    private JTextField TxtnombreUsu;
    private TerminoYCondicion formulario2;
    public String nombre;

    public Bienvenida() {

        this.setSize(400, 450);//ancho y largp
        setLocationRelativeTo(null);//centra la ventana sin necesidad de darle las medidas, ya que cada pantalla es diferente
        //this.getContentPane().setBackground(Color.RED);

        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cierra el programa
        //setLocation(490,100);//columna y fila
        //location y size setBounds(490,100,400,500);
        setTitle("Bienvenido");//Establece el titulo de la ventana
        //setIconImage(new ImageIcon(getClass().getResource("/flor.jpeg")).getImage());

        setIconImage(new ImageIcon(getClass().getResource("/dalia.JPEG")).getImage());
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        Panel();
        Etiquetas();
        colocarCajasTexto();
        colocarBotones();
    }

    private void Panel() {
        panel = new JPanel();
        panel.setLayout(null); //Desactivamos el layout predeterminado del panel
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);
    }

    private void Etiquetas() {

        JLabel inicio = new JLabel();
        inicio.setBounds(0, 0, 400, 120);
        Icon icono1 = new ImageIcon(new ImageIcon(getClass().getResource("/dalia.jpeg")).getImage()
                .getScaledInstance(inicio.getWidth(), inicio.getHeight(), 0));
        inicio.setIcon(icono1);
        inicio.setOpaque(true);
        panel.add(inicio);

        JLabel etiquetaInicio = new JLabel("Sistema de Control Vacacional");
        etiquetaInicio.setBounds(50, 130, 300, 20);
        etiquetaInicio.setForeground(Color.WHITE);
        etiquetaInicio.setFont(new Font("Elephant", Font.BOLD, 17));//establecer fuente del texto
        panel.add(etiquetaInicio);

        //Inicializar etiqueta nombre
        JLabel nombreU = new JLabel("Ingrese su nombre: ");
        nombreU.setFont(new Font("Georgia", Font.BOLD, 12));//establecer fuente del texto
        nombreU.setBounds(50, 190, 150, 20);
        nombreU.setForeground(Color.WHITE);
        panel.add(nombreU);

        JLabel etiquetaFin = new JLabel("@2007 Floreria 'La elegancia' ");
        etiquetaFin.setBounds(115, 340, 200, 20);
        etiquetaFin.setForeground(Color.WHITE);
        panel.add(etiquetaFin);

        JLabel etiquetaMisDatos = new JLabel("Elicia Más Canel, Programacion II, Sección B "); //etiqueta de texto
        etiquetaMisDatos.setBounds(70, 380, 300, 20);
        etiquetaMisDatos.setForeground(Color.WHITE);
        panel.add(etiquetaMisDatos);
    }

    private void colocarCajasTexto() {
        TxtnombreUsu = new JTextField();
        TxtnombreUsu.setFont(new Font("Georgia", Font.BOLD, 15));//establecer fuente del texto
        TxtnombreUsu.setForeground(Color.DARK_GRAY);
        TxtnombreUsu.setBounds(50, 220, 290, 25);
        TxtnombreUsu.setBackground(Color.lightGray);
        panel.add(TxtnombreUsu);
    }

    private void colocarBotones() {
        BtnIngresar = new JButton("Ingresar");
        BtnIngresar.setFont(new Font("Georgia", Font.BOLD, 13));//establecer fuente del texto
        BtnIngresar.setForeground(Color.BLACK);
        BtnIngresar.setBounds(120, 270, 150, 30);
        BtnIngresar.addActionListener(this);
        BtnIngresar.setBackground(Color.lightGray);
        panel.add(BtnIngresar);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == BtnIngresar) { //Retorna un objeto donde el evento ocurrió
            if (TxtnombreUsu.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingresar Nombre", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                nombre = TxtnombreUsu.getText();//con este método obtenemos lo que está dentro de la caja de texto
                formulario2 = new TerminoYCondicion();
                formulario2.setVisible(true);
                this.dispose(); //Esconder / cerrar el formulario activo 
            }

        }

    }
   

}

package SParcial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class TerminoYCondicion extends JFrame implements ActionListener {

    private Bienvenida formulario1;
    private JPanel panelTYC;
    private JButton BtnNoAcepto;
    private JButton BtnContinuar;
    private JLabel TxtTerminos;
    private JLabel TxtAceptar;
    private JRadioButton RadioBoton;
    private Calculo formulario3;

    public TerminoYCondicion() {
        this.setSize(600, 380);
        setTitle("Licencia de uso");
        setResizable(false);
        setMinimumSize(new Dimension(200, 200));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setIconImage(new ImageIcon(getClass().getResource("/dalia.JPEG")).getImage());
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        Panel();
        colocarRadioBotones();
        Botones();
        Etiquetas();
        Texto();
    }

    private void Panel() {
        panelTYC = new JPanel();
        panelTYC.setLayout(null);
        panelTYC.setBackground(Color.BLACK);
        this.getContentPane().add(panelTYC); //Agregamos el panel al formulario
    }

    private void Etiquetas() {

        //Etiqueta terminos y condiciones
        TxtTerminos = new JLabel("TÉRIMINOS Y CONDICIONES", SwingConstants.CENTER);
        TxtTerminos.setForeground(Color.WHITE);
        TxtTerminos.setBounds(150, 15, 290, 30);
        TxtTerminos.setOpaque(true);
        TxtTerminos.setBackground(Color.BLACK);
        TxtTerminos.setFont(new Font("Aral black", Font.BOLD, 20));
        panelTYC.add(TxtTerminos);
        //etiqueta marcar Yoacepto
        TxtAceptar = new JLabel("Yo Acepto", SwingConstants.CENTER);
        TxtAceptar.setForeground(Color.WHITE);
        TxtAceptar.setBounds(70, 255, 70, 30);
        TxtAceptar.setOpaque(true);
        TxtAceptar.setBackground(Color.BLACK);
        TxtAceptar.setFont(new Font("arial", Font.BOLD, 12));
        panelTYC.add(TxtAceptar);
    }

    private void Texto() {
        JTextArea txtareaTerminos = new JTextArea(); //creo el area de texto en donde agrego Terminos Y Condiciones
        txtareaTerminos.setBounds(20, 50, 555, 190);
        txtareaTerminos.setBackground(Color.LIGHT_GRAY);
        txtareaTerminos.setText("\n          TÉRMINOS Y CONDICIONES\n"
                + "\n"
                + "            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ELICIA.\n"
                + "            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS.\n"
                + "            C.  LA GEEKIPEDIA DE ELICIA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n"
                + "\n"
                + "          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE\n"
                + "          (LA GEEKIPEDIA DE ELICIA Y EL AUTOR ELICIA), NO SE RESPONSABILIZAN DEL USO QUE USTED\n"
                + "          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)\n"
                + "          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE.\n"
                + "\n"
                + "          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE\n"
                + "          http://www.youtube.com/eliciamas");
        txtareaTerminos.setFont(new Font("georgina", Font.BOLD, 9));
        txtareaTerminos.setEditable(false); //deshabilita el texto que está en el area, no puedes editar el contenido. 
        panelTYC.add(txtareaTerminos);

    }

    private void Botones() {
        //botón no acepto
        BtnNoAcepto = new JButton("No Acepto");
        BtnNoAcepto.setBackground(Color.LIGHT_GRAY);
        BtnNoAcepto.setFont(new Font("arial", Font.BOLD, 12));
        BtnNoAcepto.setBounds(140, 300, 100, 30);
        panelTYC.add(BtnNoAcepto);
        BtnNoAcepto.addActionListener(this);

        //botón continuar
        BtnContinuar = new JButton("Continuar");
        BtnContinuar.setBackground(Color.LIGHT_GRAY);
        BtnContinuar.setFont(new Font("arial", Font.BOLD, 12));
        BtnContinuar.setBounds(20, 300, 100, 30);
        panelTYC.add(BtnContinuar);
        BtnContinuar.setEnabled(false);
        BtnContinuar.addActionListener(this);
    }

    private void colocarRadioBotones() {
        RadioBoton = new JRadioButton("", false);
        RadioBoton.setBounds(50, 260, 20, 20);
        //RadioBoton.setEnabled(false);//deshabilitar o habilitar el radioboton.
        //RadioBoton.setText("Programación"); //Estableciendo un texto por separado, no desde el constructor.
        RadioBoton.setFont(new Font("arial", 2, 16));
        RadioBoton.setBackground(Color.BLACK);
        RadioBoton.addActionListener(this);
        panelTYC.add(RadioBoton);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (RadioBoton.isSelected()) {
            BtnContinuar.setEnabled(true);
            BtnNoAcepto.setEnabled(false);
        } else {
            BtnContinuar.setEnabled(false);
            BtnNoAcepto.setEnabled(true);
        }
        if (ae.getSource() == BtnNoAcepto) {
            formulario1 = new Bienvenida();
            formulario1.setVisible(true);
            this.setVisible(false);
        }

        if (ae.getSource() == BtnContinuar) {
            formulario3 = new Calculo();
            formulario3.setVisible(true);
            this.setVisible(false);
        }

    }

}

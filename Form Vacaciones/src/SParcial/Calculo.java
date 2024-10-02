package SParcial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculo extends JFrame implements ActionListener {

    private JPanel panel3;
    private TerminoYCondicion formulario2;
    private JMenuItem colorF;
    private JMenuItem colorA;
    private JMenuItem colorR;
    private JMenuItem colorN;
    private JMenuItem infoCreador;
    private JComboBox<String> comboDepa;
    private JComboBox<String> comboAñoAntiguo;
    private JButton calcularVacacion;
    private JTextField CNombre;
    private JTextField CApellidoPaterno;
    private JTextField CApellidoMaterno;
    private JTextArea TxtMostrarCalculo;
    int AAvacaciones;
    String nombreUsu, apellidoPaternoUsu, apellidoMaternoUsu;
    String departamentoUsuario, antiguedadUsuario;
    Bienvenida formulario1;
    private JButton limpio;
    private JButton inicio;
    private JButton salir;

    public Calculo() {

        this.setSize(640, 650);
        setTitle("Pantalla Principal");
        setResizable(false);
        setMinimumSize(new Dimension(200, 200));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciarComponentes();

        setIconImage(new ImageIcon(getClass().getResource("/dalia.JPEG")).getImage());

    }

    private void iniciarComponentes() {
        PanelC();
        EtiquetasC();
        CajaTextoC();
        MenuC();
        CombosC();
        AreaTextoC();
        BotonC();
    }

    private void PanelC() {
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(Color.BLACK);

        this.getContentPane().add(panel3);

    }

    private void EtiquetasC() {
        JLabel TxtBienvenida = new JLabel("Bienvenido", SwingConstants.CENTER);
        TxtBienvenida.setForeground(Color.WHITE);
        TxtBienvenida.setFont(new Font("georgina", Font.BOLD, 30));
        TxtBienvenida.setBounds(150, 50, 300, 30);
        panel3.add(TxtBienvenida);
        

        JLabel TxtIngresoDatousu = new JLabel("Datos del Trabajador para el calculó de vacaciones", SwingConstants.CENTER);
        TxtIngresoDatousu.setBounds(40, 110, 550, 30);
        TxtIngresoDatousu.setForeground(Color.WHITE);
        TxtIngresoDatousu.setFont(new Font("georgina", Font.BOLD, 20));
        panel3.add(TxtIngresoDatousu);

        JLabel TxtNombreU = new JLabel("Nombre Completo: ", SwingConstants.LEFT);
        TxtNombreU.setBounds(60, 175, 150, 25);
        TxtNombreU.setForeground(Color.WHITE);
        TxtNombreU.setFont(new Font("georgina", Font.PLAIN, 14));
        panel3.add(TxtNombreU);

        JLabel TxtDepa = new JLabel("Seleccionar Departamento : ", SwingConstants.LEFT);
        TxtDepa.setBounds(300, 175, 550, 25);
        TxtDepa.setForeground(Color.WHITE);
        TxtDepa.setFont(new Font("georgina", Font.PLAIN, 14));
        panel3.add(TxtDepa);

        JLabel TxtApellidoPaterno = new JLabel("Apellido Paterno: ", SwingConstants.LEFT);
        TxtApellidoPaterno.setBounds(60, 250, 120, 25);
        TxtApellidoPaterno.setForeground(Color.WHITE);
        TxtApellidoPaterno.setFont(new Font("georgina", Font.PLAIN, 14));
        panel3.add(TxtApellidoPaterno);

        JLabel TxtAntiguedad = new JLabel("Seleccionar la Antiguedad: ", SwingConstants.LEFT);
        TxtAntiguedad.setBounds(300, 250, 250, 25);
        TxtAntiguedad.setForeground(Color.WHITE);
        TxtAntiguedad.setFont(new Font("georgina", Font.PLAIN, 14));
        panel3.add(TxtAntiguedad);

        JLabel TxtApellidoMaterno = new JLabel("Apellido Materno: ", SwingConstants.LEFT);
        TxtApellidoMaterno.setBounds(60, 325, 120, 25);
        TxtApellidoMaterno.setForeground(Color.WHITE);
        TxtApellidoMaterno.setFont(new Font("georgina", Font.PLAIN, 14));
        panel3.add(TxtApellidoMaterno);

        JLabel TxtResultadoVa = new JLabel("Resultado del cálculo: ", SwingConstants.LEFT);
        TxtResultadoVa.setBounds(300, 325, 200, 25);
        TxtResultadoVa.setForeground(Color.WHITE);
        TxtResultadoVa.setFont(new Font("georgina", Font.PLAIN, 14));
        panel3.add(TxtResultadoVa);

        JLabel etiquetaFin = new JLabel("©2007 Floreria 'La elegancia' | Todos los Derechos Resevados");
        etiquetaFin.setBounds(140, 550, 400, 20);
        etiquetaFin.setForeground(Color.WHITE);
        panel3.add(etiquetaFin);

        JLabel etiquetaMisDatos = new JLabel("Elicia Más Canel, Programacion II, Sección B "); //etiqueta de texto
        etiquetaMisDatos.setBounds(190, 565, 300, 20);
        etiquetaMisDatos.setForeground(Color.WHITE);
        panel3.add(etiquetaMisDatos);

    }

    private void CajaTextoC() {
        CNombre = new JTextField();
        CNombre.setBounds(60, 200, 150, 25);
        CNombre.setFont(new Font("Georgia", Font.BOLD, 13));//establecer fuente del texto
        CNombre.setForeground(Color.BLACK);
        panel3.add(CNombre);

        CApellidoPaterno = new JTextField();
        CApellidoPaterno.setBounds(60, 275, 150, 25);
        CApellidoPaterno.setFont(new Font("Georgia", Font.BOLD, 13));//establecer fuente del texto
        CApellidoPaterno.setForeground(Color.BLACK);
        panel3.add(CApellidoPaterno);

        CApellidoMaterno = new JTextField();
        CApellidoMaterno.setFont(new Font("Georgia", Font.BOLD, 13));//establecer fuente del texto
        CApellidoMaterno.setForeground(Color.BLACK);
        CApellidoMaterno.setBounds(60, 350, 150, 25);
        panel3.add(CApellidoMaterno);
    }

    private void BotonC() {

        calcularVacacion = new JButton("Calcular");
        calcularVacacion.setFont(new Font("Georgia", Font.BOLD, 13));//establecer fuente del texto
        calcularVacacion.setForeground(Color.BLACK);
        calcularVacacion.setBackground(Color.lightGray);
        calcularVacacion.setBounds(175, 450, 100, 25);
        panel3.add(calcularVacacion);
        calcularVacacion.addActionListener(this);

        limpio = new JButton("Nuevo");
        limpio.setFont(new Font("Georgia", Font.BOLD, 13));//establecer fuente del texto
        limpio.setForeground(Color.BLACK);
        limpio.setBackground(Color.lightGray);
        limpio.setBounds(355, 450, 100, 25);
        panel3.add(limpio);
        limpio.addActionListener(this);

        inicio = new JButton("Inicio");
        inicio.setFont(new Font("Georgia", Font.BOLD, 13));//establecer fuente del texto
        inicio.setForeground(Color.BLACK);
        inicio.setBackground(Color.lightGray);
        inicio.setBounds(175, 490, 100, 25);
        panel3.add(inicio);
        inicio.addActionListener(this);

        salir = new JButton("Salir");
        salir.setFont(new Font("Georgia", Font.BOLD, 13));//establecer fuente del texto
        salir.setForeground(Color.BLACK);
        salir.setBackground(Color.lightGray);
        salir.setBounds(355, 490, 100, 25);
        panel3.add(salir);
        salir.addActionListener(this);
    }

    private void MenuC() {
        JMenuBar mCr = new JMenuBar();
        setJMenuBar(mCr);
        JMenu menu1 = new JMenu("Opciones");
        menu1.setFont(new Font("georgina", Font.PLAIN, 14));//establecer fuente del texto
        menu1.setForeground(Color.white);
        mCr.add(menu1);
        mCr.setOpaque(true);
        mCr.setBackground(Color.black);
        colorF = new JMenuItem("Fucsia");
        colorF.addActionListener(this);
        menu1.add(colorF);
        colorA = new JMenuItem("Azul");
        colorA.addActionListener(this);
        menu1.add(colorA);
        colorR = new JMenuItem("Rosado");
        colorR.addActionListener(this);
        menu1.add(colorR);
        colorN = new JMenuItem("Negro");
        colorN.addActionListener(this);
        menu1.add(colorN);

        JMenu menu2 = new JMenu("Acerca de");
        menu2.setFont(new Font("georgina", Font.PLAIN, 14));//establecer fuente del texto
        mCr.add(menu2);
        menu2.setForeground(Color.white);
        infoCreador = new JMenuItem("Creador");
        infoCreador.addActionListener(this);
        menu2.add(infoCreador);

        JMenu menu3 = new JMenu("Calcular");
        menu3.setFont(new Font("georgina", Font.PLAIN, 14));//establecer fuente del texto
        mCr.add(menu3);
        menu3.setForeground(Color.white);

    }

    private void CombosC() {
        comboDepa = new JComboBox();
        comboDepa.setBounds(300, 200, 200, 25);
        /*comboDepartamento.setForeground(Color.WHITE); letras*/
        comboDepa.setBackground(Color.WHITE);
        comboDepa.addItem("");
        comboDepa.addItem("Atención al cliente");
        comboDepa.addItem("Departamento Logística");
        comboDepa.addItem("Departamento Gerencia");
        comboDepa.setFont(new Font("Georgia", Font.BOLD, 11));//establecer fuente del texto
        comboDepa.setForeground(Color.BLACK);
        //comboDepartamento.setSelectedIndex(3); Muestra un default al inicio.
        comboDepa.addActionListener(this);
        panel3.add(comboDepa);

        comboAñoAntiguo = new JComboBox();
        comboAñoAntiguo.setBounds(300, 275, 200, 25);
        comboAñoAntiguo.setBackground(Color.WHITE);//pinta caja
        comboAñoAntiguo.addItem("");
        comboAñoAntiguo.addItem("1 año de servicio");
        comboAñoAntiguo.addItem("2 a 6 años de servicio");
        comboAñoAntiguo.addItem("Más de 7 años de servicio");
        comboAñoAntiguo.setFont(new Font("Georgia", Font.BOLD, 11));//establecer fuente del texto
        comboAñoAntiguo.setForeground(Color.BLACK);
        comboAñoAntiguo.addActionListener(this);
        panel3.add(comboAñoAntiguo);
    }

    private void AreaTextoC() {
        TxtMostrarCalculo = new JTextArea(); //creando el area de texto con la clase
        TxtMostrarCalculo.setBounds(300, 350, 310, 70);
        TxtMostrarCalculo.setText("  Aquí aparecerá el cálculo de vacaciones");//iniciando un texto en el area.
        TxtMostrarCalculo.setFont(new Font("arial", Font.PLAIN, 12));
        TxtMostrarCalculo.setForeground(Color.BLACK);
        TxtMostrarCalculo.setEditable(false); //deshabilita el texto que está en el area, no puedes editar el contenido. 
        panel3.add(TxtMostrarCalculo);
        

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == colorF) {
            panel3.setBackground(Color.MAGENTA);
        }

        if (ae.getSource() == colorA) {
            panel3.setBackground(Color.BLUE);
        }

        if (ae.getSource() == colorR) {
            panel3.setBackground(Color.PINK);
        }
        if (ae.getSource() == colorN) {
            panel3.setBackground(Color.BLACK);
        }
        if (ae.getSource() == infoCreador) {
            JOptionPane.showMessageDialog(this, "Desarrollado por La Geekipedia de Elicia"
                    + "\n www.youtube.com/EliciaMás  \n");
        }
        if (ae.getSource() == calcularVacacion) {
            if (CNombre.getText().isEmpty() || CApellidoPaterno.getText().isEmpty() || CApellidoMaterno.getText().isEmpty()
                    || comboDepa.getSelectedIndex() == 0 || comboAñoAntiguo.getSelectedIndex() == 0) {
                //String mensaje= "El nombre es".
                //mensaje = mensaje + comboDepartamento.getSelectedItem().toString();//Con esto convertimos a String
                //JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);

            } else {

                calcularVacaciones();
                departamentoUsuario = comboDepa.getSelectedItem().toString();
                antiguedadUsuario = comboAñoAntiguo.getSelectedItem().toString();
                nombreUsu = CNombre.getText();
                apellidoPaternoUsu = CApellidoPaterno.getText();
                apellidoMaternoUsu = CApellidoMaterno.getText();

                TxtMostrarCalculo.setText("El colaborador " + nombreUsu + " " + apellidoPaternoUsu
                        + " " + apellidoMaternoUsu + " quien" + "\ntrabaja en el area de " + departamentoUsuario
                        + "\n y cuenta con " + antiguedadUsuario + " recibe\n " + AAvacaciones + " días de vacaciones.");
                TxtMostrarCalculo.setFont(new Font("Georgia", Font.PLAIN, 13));//establecer fuente del texto
                TxtMostrarCalculo.setForeground(Color.BLACK);
            }
        }
        if (ae.getSource() == limpio) {
            CNombre.setText("");
            CApellidoPaterno.setText("");
            CApellidoMaterno.setText("");
            comboDepa.setSelectedIndex(0);
            comboAñoAntiguo.setSelectedIndex(0);
            TxtMostrarCalculo.setText("");
        }
        if (ae.getSource() == inicio) {
            formulario1 = new Bienvenida();
            //pantalla1.setpantalla1(this); 
            formulario1.setVisible(true);
            this.dispose(); //Esconder / cerrar el formulario activo

        }

        if (ae.getSource() == salir) {
            System.exit(0);
        }//SALIR
    }

    private int calcularVacaciones() {
        if (comboDepa.getSelectedIndex() == 1) {
            if (comboAñoAntiguo.getSelectedIndex() == 1) {
                AAvacaciones = 6;
            }
        }
        if (comboDepa.getSelectedIndex() == 1) {
            if (comboAñoAntiguo.getSelectedIndex() == 2) {
                AAvacaciones = 14;
            }
        }
        if (comboDepa.getSelectedIndex() == 1) {
            if (comboAñoAntiguo.getSelectedIndex() == 3) {
                AAvacaciones = 20;
            }
        }
        if (comboDepa.getSelectedIndex() == 2) {
            if (comboAñoAntiguo.getSelectedIndex() == 1) {
                AAvacaciones = 7;
            }
        }
        if (comboDepa.getSelectedIndex() == 2) {
            if (comboAñoAntiguo.getSelectedIndex() == 2) {
                AAvacaciones = 15;
            }
        }
        if (comboDepa.getSelectedIndex() == 2) {
            if (comboAñoAntiguo.getSelectedIndex() == 3) {
                AAvacaciones = 22;
            }
        }
        if (comboDepa.getSelectedIndex() == 3) {
            if (comboAñoAntiguo.getSelectedIndex() == 1) {
                AAvacaciones = 10;
            }
        }
        if (comboDepa.getSelectedIndex() == 3) {
            if (comboAñoAntiguo.getSelectedIndex() == 2) {
                AAvacaciones = 20;
            }
        }
        if (comboDepa.getSelectedIndex() == 3) {
            if (comboAñoAntiguo.getSelectedIndex() == 3) {
                AAvacaciones = 30;
            }
        }

        return AAvacaciones;
    }

}

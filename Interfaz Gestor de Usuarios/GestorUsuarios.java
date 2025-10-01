import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class GestorUsuarios extends JFrame {
    private JPanel mainPanel;
    private JPanel nouth;
    private JPanel west;
    private JPanel east;
    private JPanel south;
    private JLabel titulo;
    private JButton dashboard;
    private JButton Ayuda;
    private JButton ajustes;
    private JButton Informes;
    private JButton Usuarios;
    private JPanel center;
    private JLabel Nombre;
    private JTextArea textNombre;
    private JTextField textEmail;
    private JLabel email;
    private JLabel rol;
    private JComboBox rolBox;
    private JCheckBox activoBox;
    private JLabel notas;
    private JTextField textNotas;
    private JScrollPane scrollPanel;
    private JTabbedPane tabbedPanel;
    private JTextArea textResumen;
    private JPanel Resumen;
    private JScrollPane scrollResumen;
    private JPanel Logs;
    private JTextArea textLogs;
    private JScrollPane scrollLogs;
    private JButton buttonCancelar;
    private JButton buttonLimpiar;
    private JButton buttonGuardar;  // corregido nombre

    public GestorUsuarios() {
        // Configuración básica de la ventana
        setTitle("Gestión de Usuarios");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Paleta de colores y fuente
        Color grisClaro = new Color(0xECECEC);
        Color grisMedio = new Color(0xDCDCDC);
        Color accentYellow = new Color(0xFFEB3B);
        Color negro = Color.DARK_GRAY;
        Font fuente = new Font("SansSerif", Font.PLAIN, 14);

        // Panel lateral (navegación)
        JPanel panelNav = new JPanel();
        panelNav.setBackground(grisClaro);
        panelNav.setLayout(new GridLayout(5, 1, 0, 5)); // 5 botones verticales
        panelNav.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        String[] navButtons = {"Dashboard", "Usuarios", "Informes", "Ajustes", "Ayuda"};
        for (int i = 0; i < navButtons.length; i++) {
            JButton btn = new JButton(navButtons[i]);
            btn.setFont(fuente);
            btn.setFocusPainted(false);
            btn.setBackground(Color.yellow);
            btn.setForeground(negro);
            btn.setBorder(new LineBorder(grisMedio, 1, true)); // borde gris redondeado
            if (i == 0) {
                btn.setBackground(accentYellow);
            }
            panelNav.add(btn);
        }
        add(panelNav, BorderLayout.WEST);

        // Panel principal (contenido superior y centro)
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BorderLayout(10, 10));
        panelMain.setBackground(Color.WHITE);
        panelMain.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // --- Formulario de usuario ---
        JPanel panelForm = new JPanel(new GridBagLayout());
        panelForm.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        String[] labels = {"Nombre:", "Email:", "Rol:", "Activo:", "Notas:"};
        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            JLabel lbl = new JLabel(labels[i]);
            lbl.setFont(fuente);
            panelForm.add(lbl, gbc);

            gbc.gridx = 1;
            JComponent comp;
            if (i == 3) {
                // Checkbox para "Activo"
                comp = new JCheckBox();
                ((JCheckBox) comp).setBackground(Color.WHITE);
            } else if (i == 4) {
                // Área de texto para "Notas"
                comp = new JTextArea(3, 20);
                ((JTextArea) comp).setBorder(new LineBorder(grisMedio, 1, true));
                ((JTextArea) comp).setFont(fuente);
            } else {
                // Campos de texto para "Nombre", "Email", "Rol"
                comp = new JTextField(20);
                ((JTextField) comp).setBorder(new LineBorder(grisMedio, 1, true));
                ((JTextField) comp).setFont(fuente);
            }
            panelForm.add(comp, gbc);
        }
        panelMain.add(panelForm, BorderLayout.NORTH);

        // --- Panel de resumen con pestañas ---
        JTabbedPane pestañas = new JTabbedPane();
        pestañas.setFont(fuente);

        JPanel resumen1 = new JPanel();
        resumen1.setBackground(Color.WHITE);
        resumen1.add(new JLabel("Resumen general de usuarios"));
        pestañas.addTab("Resumen", resumen1);

        JPanel resumen2 = new JPanel();
        resumen2.setBackground(Color.WHITE);
        resumen2.add(new JLabel("Detalles adicionales"));
        pestañas.addTab("Detalles", resumen2);

        panelMain.add(pestañas, BorderLayout.CENTER);

        // Agregar panel principal al centro
        add(panelMain, BorderLayout.CENTER);

        // --- Panel inferior con botones ---
        JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        south.setBackground(Color.WHITE);
        south.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Botón Cancelar
        buttonCancelar = new JButton("Cancelar");
        buttonCancelar.setFont(fuente);
        buttonCancelar.setFocusPainted(false);
        buttonCancelar.setBackground(Color.red);
        buttonCancelar.setForeground(negro);
        buttonCancelar.setBorder(new LineBorder(grisMedio, 1, true));
        south.add(buttonCancelar);

        // Botón Limpiar
        buttonLimpiar = new JButton("Limpiar");
        buttonLimpiar.setFont(fuente);
        buttonLimpiar.setFocusPainted(false);
        buttonLimpiar.setBackground(Color.yellow);
        buttonLimpiar.setForeground(negro);
        buttonLimpiar.setBorder(new LineBorder(grisMedio, 1, true));
        south.add(buttonLimpiar);

        // Botón Guardar
        buttonGuardar = new JButton("Guardar");
        buttonGuardar.setFont(fuente);
        buttonGuardar.setFocusPainted(false);
        buttonGuardar.setBackground(Color.blue);
        buttonGuardar.setForeground(negro);
        buttonGuardar.setBorder(new LineBorder(grisMedio, 1, true));
        south.add(buttonGuardar);

        // Agregar panel de botones al sur de la ventana
        add(south, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GestorUsuarios().setVisible(true);
        });
    }
}

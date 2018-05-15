package vista;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import controlador.CVPrincipal;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {
	private JMenuBar menuBar;
	private JMenu mnPI;
	private JMenuItem mntmNuevoPI;
	private JMenuItem mntmModificarPI;
	private JMenuItem mntmEliminarPI;
	private JMenuItem mntmConsultaPI;
	private JMenu mnAlumnos;
	private JMenuItem mntmCrearAlumno;
	private JMenuItem mntmModificarAlumno;
	private JMenuItem mntmEliminarAlumno;
	private JMenu mnArea;
	private JMenuItem mntmCrearArea;
	private JMenuItem mntmModificarArea;
	private JMenuItem mntmEliminarArea;
	private JScrollPane scrollPanelCentral;

	public VentanaPrincipal() throws HeadlessException {
		super("GesPring");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/images/ue.png")));
		cargarMenu();
		inicializar();
	}

	private void inicializar() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		//Scroll Central y su panel Inicial
		scrollPanelCentral = new JScrollPane();
		getContentPane().add(scrollPanelCentral, BorderLayout.CENTER);
		
		//Settings de la ventana
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(500, 100, 650, 600);
	}

	private void cargarMenu() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPI = new JMenu("P. I.");
		mnPI.setMnemonic('P');
		menuBar.add(mnPI);
		
		mntmNuevoPI = new JMenuItem("Nuevo P. I.");
		mntmNuevoPI.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/crear.jpg")));
		mntmNuevoPI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.ALT_MASK));
		mnPI.add(mntmNuevoPI);
		
		mntmModificarPI = new JMenuItem("Modificar P. I.");
		mntmModificarPI.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/editar.png")));
		mntmModificarPI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.ALT_MASK));
		mnPI.add(mntmModificarPI);
		
		mntmEliminarPI = new JMenuItem("Eliminar P. I.");
		mntmEliminarPI.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/papelera.jpg")));
		mntmEliminarPI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_MASK));
		mnPI.add(mntmEliminarPI);
		
		mntmConsultaPI = new JMenuItem("Consulta P. I.");
		mntmConsultaPI.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/buscar.png")));
		mntmConsultaPI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_MASK));
		mnPI.add(mntmConsultaPI);
		
		mnAlumnos = new JMenu("Alumnos");
		mnAlumnos.setMnemonic('A');
		menuBar.add(mnAlumnos);
		
		mntmCrearAlumno = new JMenuItem("Crear Alumno");
		mnAlumnos.add(mntmCrearAlumno);
		
		mntmModificarAlumno = new JMenuItem("Modificar Alumno");
		mnAlumnos.add(mntmModificarAlumno);
		
		mntmEliminarAlumno = new JMenuItem("Eliminar Alumno");
		mnAlumnos.add(mntmEliminarAlumno);
		
		mnArea = new JMenu("Área");
		mnArea.setMnemonic('r');
		menuBar.add(mnArea);
		
		mntmCrearArea = new JMenuItem("Crear Área");
		mnArea.add(mntmCrearArea);
		
		mntmModificarArea = new JMenuItem("Modificar Área");
		mnArea.add(mntmModificarArea);

		mntmEliminarArea = new JMenuItem("Eliminar Área");
		mnArea.add(mntmEliminarArea);
	}

	public void hacerVisible() {
		setVisible(true);
	}
	
	/**
	 * Añadimos el controlador a los elementos que producen eventos
	 * @param cv controlador que se va a utilizar para los eventos de esta ventana
	 */
	public void addControlador(CVPrincipal cv) {
		//P.I
		mntmNuevoPI.setActionCommand(CVPrincipal.P_CREATE);
		mntmNuevoPI.addActionListener(cv);
		mntmModificarPI.setActionCommand(CVPrincipal.P_MOD);
		mntmModificarPI.addActionListener(cv);
		mntmEliminarPI.setActionCommand(CVPrincipal.P_DEL);
		mntmEliminarPI.addActionListener(cv);
		mntmConsultaPI.setActionCommand(CVPrincipal.P_CONS);
		mntmConsultaPI.addActionListener(cv);
		
		//Áreas
		mntmCrearArea.setActionCommand(CVPrincipal.AREA_CREATE);
		mntmCrearArea.addActionListener(cv);
		mntmModificarArea.setActionCommand(CVPrincipal.AREA_MOD);
		mntmModificarArea.addActionListener(cv);
		mntmEliminarArea.setActionCommand(CVPrincipal.AREA_DEL);
		mntmEliminarArea.addActionListener(cv);
		
		//ALUMNOS
		mntmCrearAlumno.setActionCommand(CVPrincipal.ALUMNO_CREATE);
		mntmCrearAlumno.addActionListener(cv);
		mntmModificarAlumno.setActionCommand(CVPrincipal.ALUMNO_MOD);
		mntmModificarAlumno.addActionListener(cv);
		mntmEliminarAlumno.setActionCommand(CVPrincipal.ALUMNO_DEL);
		mntmEliminarAlumno.addActionListener(cv);
	}

	/**
	 * Método que utilizaremos para cambiar el contenido del ScrollPane
	 */
	public void setPanelCentral(JPanel panel) {
		scrollPanelCentral.setViewportView(panel);
	}
	
}

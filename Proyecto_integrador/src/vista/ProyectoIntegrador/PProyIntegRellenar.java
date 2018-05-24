/**
 * @author Javier
 */
package vista.ProyectoIntegrador;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.ProyectoIntegrador.CProyIntegCrear;

import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public abstract class PProyIntegRellenar extends PProyIntegBasico {
	private JTextField txtNombre;
	private JTextField txtUrl;
	private JButton btnAnadirMiembro;
	private JButton btnValidar;
	private JButton btnCancelar;
	private JTable tableMiembros;
	private final ButtonGroup buttonGroupCurso = new ButtonGroup();
	private JScrollPane scrollMiembros;
	private JSlider sliderNota;
	private JSpinner spinner;
	private JRadioButton radPrimero;
	private JRadioButton radioButtonSegundo;

	public PProyIntegRellenar() {
		super();
		inicializar();
	}

	private void inicializar() {
		setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(153, 60, 321, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtUrl = new JTextField();
		txtUrl.setBounds(155, 190, 319, 20);
		add(txtUrl);
		txtUrl.setColumns(10);
		
		JComboBox comboArea = new JComboBox();
		comboArea.setBounds(155, 240, 319, 20);
		add(comboArea);
		
		JComboBox comboGrupo = new JComboBox();
		comboGrupo.setBounds(155, 290, 319, 20);
		add(comboGrupo);
		
		scrollMiembros = new JScrollPane();
		scrollMiembros.setBounds(153, 91, 321, 88);
		add(scrollMiembros);
		
		tableMiembros = new JTable();
		tableMiembros.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nº Expediente", "Nombre", "Apellidos"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Long.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableMiembros.getColumnModel().getColumn(0).setPreferredWidth(60);
		tableMiembros.getColumnModel().getColumn(1).setPreferredWidth(128);
		tableMiembros.getColumnModel().getColumn(2).setPreferredWidth(129);
		tableMiembros.getColumnModel().getColumn(3).setPreferredWidth(199);
		scrollMiembros.setViewportView(tableMiembros);
		
		btnAnadirMiembro = new JButton("A\u00F1adir Miembro");
		btnAnadirMiembro.setBounds(484, 88, 133, 23);
		add(btnAnadirMiembro);
		
		btnValidar = new JButton("Validar");
		btnValidar.setBounds(184, 321, 89, 23);
		add(btnValidar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(344, 321, 89, 23);
		add(btnCancelar);
		
		sliderNota = new JSlider();
		sliderNota.setPaintLabels(true);
		sliderNota.setPaintTicks(true);
		sliderNota.setMinorTickSpacing(1);
		sliderNota.setMaximum(10);
		sliderNota.setBounds(223, 213, 251, 26);
		add(sliderNota);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(10), new Float(1)));
		spinner.setBounds(153, 213, 44, 20);
		add(spinner);
		
		radPrimero = new JRadioButton("  1\u00BA");
		buttonGroupCurso.add(radPrimero);
		radPrimero.setBounds(213, 267, 109, 23);
		add(radPrimero);
		
		radioButtonSegundo = new JRadioButton("  2\u00BA");
		buttonGroupCurso.add(radioButtonSegundo);
		radioButtonSegundo.setBounds(324, 267, 109, 23);
		add(radioButtonSegundo);
	}

	public JButton getBtnAnadirMiembro() {
		return btnAnadirMiembro;
	}

	public void setBtnAnadirMiembro(JButton btnAnadirMiembro) {
		this.btnAnadirMiembro = btnAnadirMiembro;
	}

	public JButton getBtnValidar() {
		return btnValidar;
	}

	public void setBtnValidar(JButton btnValidar) {
		this.btnValidar = btnValidar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

}//Fin clase PProyIntegRellenar

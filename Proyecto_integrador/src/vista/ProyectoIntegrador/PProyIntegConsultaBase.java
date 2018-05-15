package vista.ProyectoIntegrador;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PProyIntegConsultaBase extends JPanel {
	private JLabel lblNombre;
	private JLabel lblFiltros;
	private JLabel lblArea;
	private JTextField txtNombrebusq;
	private JSeparator separator;
	private JComboBox comboAreaBusq;
	private JComboBox comboCursoBusq;
	private JComboBox comboGrupoBusq;
	private JTable table;
	private JLabel lblCurso;
	private JLabel lblGrupo;
	private JButton btnBuscar;
	private JButton btnSeleccionarTodo;
	private JButton btnCancelar;
	private JScrollPane scrollLista;

	
	
	public PProyIntegConsultaBase() {
		super();
		inicializar();
	}

	private void inicializar() {
		setLayout(null);
		
		lblFiltros = new JLabel("Filtros");
		lblFiltros.setBounds(64, 40, 46, 14);
		add(lblFiltros);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(85, 65, 46, 14);
		add(lblNombre);
		
		lblArea = new JLabel("\u00C1rea:");
		lblArea.setBounds(85, 83, 46, 14);
		add(lblArea);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(85, 102, 46, 14);
		add(lblCurso);
		
		lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(85, 123, 46, 14);
		add(lblGrupo);
		
		txtNombrebusq = new JTextField();
		txtNombrebusq.setBounds(141, 62, 255, 20);
		add(txtNombrebusq);
		txtNombrebusq.setColumns(10);
		
		separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(64, 181, 450, 14);
		add(separator);
		
		comboAreaBusq = new JComboBox();
		comboAreaBusq.setBounds(141, 80, 255, 20);
		add(comboAreaBusq);
		
		comboCursoBusq = new JComboBox();
		comboCursoBusq.setBounds(141, 99, 255, 20);
		add(comboCursoBusq);
		
		comboGrupoBusq = new JComboBox();
		comboGrupoBusq.setBounds(141, 120, 255, 20);
		add(comboGrupoBusq);
		
		scrollLista = new JScrollPane();
		scrollLista.setBounds(55, 227, 475, 156);
		add(scrollLista);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"id", "Nombre", "Miembros", "\u00C1rea", "Curso", "Grupo", "Seleccionado"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Integer.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(45);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(137);
		scrollLista.setViewportView(table);
		
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(391, 394, 89, 23);
		add(btnCancelar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(230, 151, 89, 23);
		add(btnBuscar);
		
		btnSeleccionarTodo = new JButton("Seleccionar Todo");
		btnSeleccionarTodo.setBounds(354, 193, 135, 23);
		add(btnSeleccionarTodo);
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
	
	
}

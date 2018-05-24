package vista.ProyectoIntegrador;
import javax.swing.JLabel;

import controlador.ProyectoIntegrador.CProyIntegConsulta;
import controlador.ProyectoIntegrador.CProyIntegResultado;

import javax.swing.JButton;

public class PProyIntegResultado extends PProyIntegBasico {
	private JLabel lblNombrecons;
	private JLabel lblMiembroscons;
	private JLabel lblUrlcons;
	private JLabel lblNotacons;
	private JLabel lblAreacons;
	private JLabel lblTitulo;
	private JButton btnAtras;

	
	
	public PProyIntegResultado() {
		super();
		inicializar();
	}

	private void inicializar() {
		
		lblNombrecons = new JLabel("NombreCons");
		lblNombrecons.setBounds(123, 64, 187, 14);
		add(lblNombrecons);
		
		lblMiembroscons = new JLabel("MiembrosCons");
		lblMiembroscons.setBounds(123, 89, 187, 14);
		add(lblMiembroscons);
		
		lblUrlcons = new JLabel("UrlCons");
		lblUrlcons.setBounds(123, 196, 187, 14);
		add(lblUrlcons);
		
		lblNotacons = new JLabel("NotaCons");
		lblNotacons.setBounds(123, 221, 187, 14);
		add(lblNotacons);
		
		lblAreacons = new JLabel("AreaCons");
		lblAreacons.setBounds(123, 246, 187, 14);
		add(lblAreacons);
		
		JLabel lblCursocons = new JLabel("CursoCons");
		lblCursocons.setBounds(123, 271, 187, 14);
		add(lblCursocons);
		
		JLabel lblGrupocons = new JLabel("GrupoCons");
		lblGrupocons.setBounds(123, 296, 187, 14);
		add(lblGrupocons);
		
		lblTitulo = new JLabel("Informaci\u00F3n del Proyecto");
		lblTitulo.setBounds(186, 25, 145, 14);
		add(lblTitulo);
		
		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(221, 343, 89, 23);
		add(btnAtras);
	}
	
	public void addControlador(CProyIntegResultado cpr) {
		btnAtras.setActionCommand(CProyIntegResultado.ATRAS);
		btnAtras.addActionListener(cpr);
	}
}

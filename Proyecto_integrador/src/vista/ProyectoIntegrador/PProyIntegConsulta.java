package vista.ProyectoIntegrador;
import javax.swing.JLabel;

import controlador.ProyectoIntegrador.CProyIntegConsulta;

import javax.swing.JButton;

public class PProyIntegConsulta extends PProyIntegConsultaBase {
	private JLabel lblTitulo;
	private JButton btnConsultar;

	public PProyIntegConsulta() {
		super();
		inicializar();
	}
	
	private void inicializar() {
		lblTitulo = new JLabel("Consultas sobre Proyectos Integradores");
		lblTitulo.setBounds(183, 24, 213, 14);
		add(lblTitulo);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(230, 394, 89, 23);
		add(btnConsultar);
	}
	
	public void addControlador(CProyIntegConsulta cpc) {
		btnConsultar.setActionCommand(CProyIntegConsulta.CONSULTAR);
		btnConsultar.addActionListener(cpc);
		
		getBtnCancelar().setActionCommand(CProyIntegConsulta.CANCELAR);
		getBtnCancelar().addActionListener(cpc);
		
		//TODO botón buscar
	}
	
}

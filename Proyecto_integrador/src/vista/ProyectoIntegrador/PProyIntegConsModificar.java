package vista.ProyectoIntegrador;
import javax.swing.JLabel;

import controlador.ProyectoIntegrador.CProyIntegConsModificar;

import javax.swing.JButton;

public class PProyIntegConsModificar extends PProyIntegConsultaBase {
	private JLabel lblTitulo;
	private JButton btnModificar;

	public PProyIntegConsModificar() {
		super();
		inicializar();
	}
	
	public void inicializar() {
		lblTitulo = new JLabel("Selecci\u00F3n del Proyecto a modificar");
		lblTitulo.setBounds(203, 22, 217, 14);
		add(lblTitulo);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(230, 394, 89, 23);
		add(btnModificar);
	}
	
	public void addControlador(CProyIntegConsModificar ccm) {
		btnModificar.setActionCommand(CProyIntegConsModificar.MODIFICAR);
		btnModificar.addActionListener(ccm);
		
		getBtnCancelar().setActionCommand(CProyIntegConsModificar.CANCELAR);
		getBtnCancelar().addActionListener(ccm);
		
		//TODO buscar
	}
}

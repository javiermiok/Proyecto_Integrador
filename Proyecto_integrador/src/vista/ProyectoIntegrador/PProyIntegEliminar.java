package vista.ProyectoIntegrador;
import javax.swing.JLabel;

import controlador.ProyectoIntegrador.CProyIntegEliminar;

import javax.swing.JButton;

public class PProyIntegEliminar extends PProyIntegConsultaBase {
	private JButton btnEliminar;
	private JLabel lblTitulo;

	public PProyIntegEliminar() {
		super();
		inicializar();
	}
	
	private void inicializar() {
		lblTitulo = new JLabel("Eliminar Proyecto Integrador");
		lblTitulo.setBounds(222, 11, 171, 43);
		add(lblTitulo);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(236, 395, 89, 23);
		add(btnEliminar);
	}
	
	public void addControlador(CProyIntegEliminar ce) {
		btnEliminar.setActionCommand(CProyIntegEliminar.ELIMINAR);
		btnEliminar.addActionListener(ce);
		
		getBtnCancelar().setActionCommand(CProyIntegEliminar.CANCELAR);
		getBtnCancelar().addActionListener(ce);
		
		//TODO boton buscar
	}
}

package vista.ProyectoIntegrador;
import javax.swing.JLabel;

import controlador.ProyectoIntegrador.CProyIntegCrear;

import java.awt.Dimension;

public class PProyIntegCrear extends PProyIntegRellenar {
	private JLabel lblTitulo;

	public PProyIntegCrear() {
		super();
		inicializar();
	}

	private void inicializar() {
		lblTitulo = new JLabel("Nuevo Proyecto Integrador");
		lblTitulo.setBounds(235, 23, 176, 14);
		add(lblTitulo);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void addControler(CProyIntegCrear cc) {
		getBtnCancelar().setActionCommand(CProyIntegCrear.CANCELAR);
		getBtnCancelar().addActionListener(cc);
		
		getBtnValidar().setActionCommand(CProyIntegCrear.VALIDAR);
		getBtnValidar().addActionListener(cc);
		
		getBtnAnadirMiembro().setActionCommand(CProyIntegCrear.ANADIR_MIEMBRO);
		getBtnAnadirMiembro().addActionListener(cc);
	}
}

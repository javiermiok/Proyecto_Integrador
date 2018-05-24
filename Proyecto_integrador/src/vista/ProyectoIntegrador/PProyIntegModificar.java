package vista.ProyectoIntegrador;

import controlador.ProyectoIntegrador.CProyIntegCrear;
import controlador.ProyectoIntegrador.CProyIntegModificar;

public class PProyIntegModificar extends PProyIntegRellenar {
	
	public PProyIntegModificar() {
		super();
		inicializar();
	}

	private void inicializar() {
		getBtnValidar().setText("Modificar");
	}
	
	public void addCotrolador(CProyIntegModificar cm) {
		getBtnCancelar().setActionCommand(CProyIntegCrear.CANCELAR);
		getBtnCancelar().addActionListener(cm);
		
		getBtnValidar().setActionCommand(CProyIntegCrear.VALIDAR);
		getBtnValidar().addActionListener(cm);
		
		getBtnAnadirMiembro().setActionCommand(CProyIntegCrear.ANADIR_MIEMBRO);
		getBtnAnadirMiembro().addActionListener(cm);
	}
}

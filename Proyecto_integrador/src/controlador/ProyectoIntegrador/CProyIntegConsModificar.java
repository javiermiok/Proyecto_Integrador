package controlador.ProyectoIntegrador;

import java.awt.event.ActionEvent;

import controlador.ControladorPadre;
import vista.PanelInicio;
import vista.VentanaPrincipal;
import vista.ProyectoIntegrador.PProyIntegModificar;

public class CProyIntegConsModificar implements ControladorPadre {

	public static final String MODIFICAR = "M";
	public static final String CANCELAR = "C";

	private VentanaPrincipal vp;
	private PanelInicio pInicio;
	private PProyIntegModificar pModificar;

	public CProyIntegConsModificar(VentanaPrincipal vp) {
		this.vp = vp;
	}

	public void setpInicio(PanelInicio pInicio) {
		this.pInicio = pInicio;
	}
	
	public void setpModificar(PProyIntegModificar pModificar) {
		this.pModificar = pModificar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		case CANCELAR:
			vp.setPanelCentral(pInicio);
			break;
		case MODIFICAR:
			vp.setPanelCentral(pModificar);
			break;
		// TODO buscar
		default:
			;
		}// Fin switch
	}

}

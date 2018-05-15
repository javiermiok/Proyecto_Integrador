package controlador.ProyectoIntegrador;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import controlador.ControladorPadre;
import vista.PanelInicio;
import vista.VentanaPrincipal;

public class CProyIntegEliminar implements ControladorPadre {
	
	public static final String CANCELAR = "C";
	public static final String ELIMINAR = "E";
	
	private VentanaPrincipal vp;
	private PanelInicio pInicio;
	
	public CProyIntegEliminar(VentanaPrincipal vp) {
		this.vp = vp;
	}
	
	public void setpInicio(PanelInicio pInicio) {
		this.pInicio = pInicio;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		case CANCELAR:
			//TODO borrar campos e eliminar
			vp.setPanelCentral(pInicio);
			break;
		
		case ELIMINAR:
			int respuesta = JOptionPane.showConfirmDialog(vp, 
					"¿Seguro que quieres eliminar este proyecto?",
					"Confirmación",
					JOptionPane.YES_NO_OPTION);
			if(respuesta == JOptionPane.YES_OPTION) {
				//TODO eliminar el proyecto
				vp.setPanelCentral(pInicio);
			} 
			break;
		// TODO OTROS BOTONES
		default:
			;
		}//fin switch
	}//fin actionPerformed()

}

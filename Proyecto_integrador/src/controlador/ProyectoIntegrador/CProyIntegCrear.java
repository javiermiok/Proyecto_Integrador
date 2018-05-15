package controlador.ProyectoIntegrador;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import controlador.ControladorPadre;
import vista.PanelInicio;
import vista.VentanaPrincipal;

public class CProyIntegCrear implements ControladorPadre {

	public static final String CANCELAR = "C";
	public static final String VALIDAR = "V";
	public static final String ANADIR_MIEMBRO = "A";
	
	private VentanaPrincipal vp;
	private PanelInicio pInicio;
	
	public CProyIntegCrear(VentanaPrincipal vp) {
		this.vp=vp;
	}
	
	public void setpInicio(PanelInicio pInicio) {
		this.pInicio = pInicio;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		case CANCELAR:
			//TODO vaciar campos del panel
			vp.setPanelCentral(pInicio);
			break;
		case VALIDAR:
			// TODO comprobar si todo está bien
			int respuesta = JOptionPane.showConfirmDialog(vp, 
					"Se ha creado el proyecto, ¿Quieres añadir otro proyecto?",
					"Creado con éxito",
					JOptionPane.YES_NO_OPTION);
			if(respuesta == JOptionPane.YES_OPTION) {
				//TODO vaciar campos
			} else {
				vp.setPanelCentral(pInicio);
			}
			break;
			
		case ANADIR_MIEMBRO:
			// TODO Abrir una ventana/cambiar a un panel de consulta de miembros
			break;
			
		default:
			;
		}//fin switch
		
	}//fin actionPerformed()

}//Fin clase CProyIntegCrear

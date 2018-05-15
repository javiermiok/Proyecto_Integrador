package controlador.ProyectoIntegrador;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import controlador.ControladorPadre;
import vista.VentanaPrincipal;
import vista.ProyectoIntegrador.PProyIntegConsModificar;

public class CProyIntegModificar implements ControladorPadre {

	public static final String CANCELAR = "C";
	public static final String VALIDAR = "V";
	public static final String ANADIR_MIEMBRO = "A";
	
	private VentanaPrincipal vp;
	private PProyIntegConsModificar pConsModificar;
	
	public CProyIntegModificar(VentanaPrincipal vp) {
		this.vp=vp;
	}
	
	public void setpConsModificar(PProyIntegConsModificar pConsModificar) {
		this.pConsModificar = pConsModificar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		case CANCELAR:
			//TODO vaciar los campos de Modficiar
			vp.setPanelCentral(pConsModificar);
			break;
		case VALIDAR:
			// TODO comprobar si todo está bien
			int respuesta = JOptionPane.showConfirmDialog(vp, 
					"¿Seguro que quieres modificar el proyecto?",
					"Confirmación",
					JOptionPane.YES_NO_OPTION);
			if(respuesta == JOptionPane.YES_OPTION) {
				//TODO modificar el proyecto
				vp.setPanelCentral(pConsModificar);
				//TODO vaciar los campos pModificar, y acualizar los de pConsModificar
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

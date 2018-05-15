package controlador.ProyectoIntegrador;

import java.awt.event.ActionEvent;

import controlador.ControladorPadre;
import vista.VentanaPrincipal;
import vista.ProyectoIntegrador.PProyIntegConsulta;

public class CProyIntegResultado implements ControladorPadre {
	
	public static final String ATRAS = "A";
	
	private VentanaPrincipal vp;
	private PProyIntegConsulta pConsulta;
	
	public CProyIntegResultado(VentanaPrincipal vp) {
		this.vp = vp;
	}

	
	public void setpConsulta(PProyIntegConsulta pConsulta) {
		this.pConsulta = pConsulta;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(ATRAS)) {
			vp.setPanelCentral(pConsulta);
		}
	}//fin actionPerformed()

}

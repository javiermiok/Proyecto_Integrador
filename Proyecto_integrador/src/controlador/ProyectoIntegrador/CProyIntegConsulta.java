package controlador.ProyectoIntegrador;

import java.awt.event.ActionEvent;

import controlador.ControladorPadre;
import vista.PanelInicio;
import vista.VentanaPrincipal;
import vista.ProyectoIntegrador.PProyIntegResultado;

public class CProyIntegConsulta implements ControladorPadre {

	public static final String CANCELAR="C";
	public static final String CONSULTAR="O";
	
	private VentanaPrincipal vp;
	private PanelInicio pInicio;
	private PProyIntegResultado pResultado;
	
	public CProyIntegConsulta(VentanaPrincipal vp) {
		this.vp = vp;
	}
	
	public void setpInicio(PanelInicio pInicio) {
		this.pInicio = pInicio;
	}

	public void setpResultado(PProyIntegResultado pResultado) {
		this.pResultado = pResultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
		case CANCELAR:
			//TODO borrar datos de la consulta
			vp.setPanelCentral(pInicio);
			break;
			
		case CONSULTAR:
			//TODO pasar info de que quieres consultar
			vp.setPanelCentral(pResultado);
			break;
		}//fin switch
	}

}//Fin clase CProyIntegConsulta

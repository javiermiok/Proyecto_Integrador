package controlador;

import java.awt.event.ActionEvent;

import vista.VentanaPrincipal;
import vista.ProyectoIntegrador.PProyIntegConsModificar;
import vista.ProyectoIntegrador.PProyIntegConsulta;
import vista.ProyectoIntegrador.PProyIntegCrear;
import vista.ProyectoIntegrador.PProyIntegEliminar;


public class CVPrincipal implements ControladorPadre {

	public static final String P_CREATE="P_C";
	public static final String P_MOD="P_M";
	public static final String P_DEL="P_D";
	public static final String P_CONS="P_CONS";
	
	public static final String AREA_CREATE="AR_C";
	public static final String AREA_MOD="AR_M";
	public static final String AREA_DEL="AR_D";
	
	public static final String ALUMNO_CREATE="AL_C";
	public static final String ALUMNO_MOD="AL_M";
	public static final String ALUMNO_DEL="AL_D";
	
	private VentanaPrincipal vp;
	private PProyIntegCrear pCrear;
	private PProyIntegConsModificar pConsModificar;
	private PProyIntegEliminar pEliminar;
	private PProyIntegConsulta pConsulta;
	//TODO Ricardo Añadir paneles Áreas
	//TODO Gonzalo Añadir paneles alumnos
	
	public CVPrincipal(VentanaPrincipal vp) {
		this.vp=vp;
	}
	
	public void setpCrear(PProyIntegCrear pCrear) {
		this.pCrear = pCrear;
	}

	public void setpConsModificar(PProyIntegConsModificar pConsModificar) {
		this.pConsModificar = pConsModificar;
	}

	public void setpEliminar(PProyIntegEliminar pEliminar) {
		this.pEliminar = pEliminar;
	}

	public void setpConsulta(PProyIntegConsulta pConsulta) {
		this.pConsulta = pConsulta;
	}
	
	//TODO Ricardo Añadir setters de paneles Áreas
	//TODO Gonzalo Añadir setters de paneles alumnos

	/**
	 * Administra las opciones del menú
	 * Asigna el panel de la opción a la ventana principal
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		case P_CREATE:
			vp.setPanelCentral(pCrear);
			break;
			
		case P_MOD:
			vp.setPanelCentral(pConsModificar);
			break;
			
		case P_DEL:
			vp.setPanelCentral(pEliminar);
			break;
		
		case P_CONS:
			vp.setPanelCentral(pConsulta);
			break;
			
		case AREA_CREATE:
			// TODO Ricardo activar el panel crear_area
			break;
			
		case AREA_MOD:
			// TODO Ricardo activar el panel modificar_area
			break;
			
		case AREA_DEL:
			// TODO Ricardo activar el panel eliminar_area
			break;
			
		case ALUMNO_CREATE:
			// TODO Gonzalo activar el panel crear_alumno
			break;
			
		case ALUMNO_MOD:
			// TODO Gonzalo activar el panel modificar_alumno
			break;
			
		case ALUMNO_DEL:
			// TODO Gonzalo activar el panel eliminar_alumno
			break;
			
		default:
			;
		}//fin switch
	}//fin actionPerformed()

}//fin de la clase

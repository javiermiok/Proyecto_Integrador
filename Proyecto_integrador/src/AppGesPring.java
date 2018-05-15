
import java.awt.EventQueue;

import controlador.CVPrincipal;
import controlador.ProyectoIntegrador.CProyIntegConsModificar;
import controlador.ProyectoIntegrador.CProyIntegConsulta;
import controlador.ProyectoIntegrador.CProyIntegCrear;
import controlador.ProyectoIntegrador.CProyIntegEliminar;
import controlador.ProyectoIntegrador.CProyIntegModificar;
import controlador.ProyectoIntegrador.CProyIntegResultado;
import vista.PanelInicio;
import vista.VentanaPrincipal;
import vista.ProyectoIntegrador.PProyIntegConsModificar;
import vista.ProyectoIntegrador.PProyIntegConsulta;
import vista.ProyectoIntegrador.PProyIntegCrear;
import vista.ProyectoIntegrador.PProyIntegEliminar;
import vista.ProyectoIntegrador.PProyIntegModificar;
import vista.ProyectoIntegrador.PProyIntegResultado;

/**
 * Clase que contiene el main
 * @author 
 *
 */
public class AppGesPring {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//1º Creación de la ventana Principal y panel inicial
					VentanaPrincipal ventana = new VentanaPrincipal();
					CVPrincipal controladorV = new CVPrincipal(ventana);
					ventana.addControlador(controladorV);
					
					PanelInicio pInicio = new PanelInicio();
					ventana.setPanelCentral(pInicio);
					
					//2º Creación de los paneles P.I
					PProyIntegCrear pCrear = new PProyIntegCrear();
					CProyIntegCrear cCrear = new CProyIntegCrear(ventana);
					cCrear.setpInicio(pInicio);
					pCrear.addControler(cCrear);
					controladorV.setpCrear(pCrear);
					
					PProyIntegModificar pModificar = new PProyIntegModificar();
					CProyIntegModificar cModificar = new CProyIntegModificar(ventana);
					pModificar.addCotrolador(cModificar);
					
					PProyIntegConsModificar pConsModificar = new PProyIntegConsModificar();
					CProyIntegConsModificar cConsModificar = new CProyIntegConsModificar(ventana);
					pConsModificar.addControlador(cConsModificar);
					cConsModificar.setpInicio(pInicio);
					cConsModificar.setpModificar(pModificar);
					controladorV.setpConsModificar(pConsModificar);
					
					cModificar.setpConsModificar(pConsModificar);
					
					PProyIntegEliminar pEliminar = new PProyIntegEliminar();
					CProyIntegEliminar cEliminar = new CProyIntegEliminar(ventana);
					pEliminar.addControlador(cEliminar);
					cEliminar.setpInicio(pInicio);
					controladorV.setpEliminar(pEliminar);
					
					PProyIntegConsulta pConsulta = new PProyIntegConsulta();
					CProyIntegConsulta cConsulta = new CProyIntegConsulta(ventana);
					pConsulta.addControlador(cConsulta);
					cConsulta.setpInicio(pInicio);
					controladorV.setpConsulta(pConsulta);
					
					PProyIntegResultado pResultado = new PProyIntegResultado();
					CProyIntegResultado cResultado = new CProyIntegResultado(ventana);
					pResultado.addControlador(cResultado);
					cResultado.setpConsulta(pConsulta);
					
					cConsulta.setpResultado(pResultado); 
					
					//3º Creación de los paneles Áreas
					//TODO Ricardo
					
					//4º Creación de los paneles Alumnos
					//TODO Gonzalo
					
					ventana.hacerVisible();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}//fin run()
			
		});//fin invokeLater()
		
	}//fin main()
	
}//FIN clase AppGesPring

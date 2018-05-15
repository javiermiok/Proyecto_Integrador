/**
 * @author Javier
 */
package vista.ProyectoIntegrador;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;

public abstract class PProyIntegBasico extends JPanel {
	private JLabel lblNombre;
	private JLabel lblComponentes;
	private JLabel lblUrl;
	private JLabel lblNota;
	private JLabel lbArea;

	public PProyIntegBasico() {
		super();
		inicializar();
	}

	private void inicializar() {
		// TODO Auto-generated method stub
		setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(28, 65, 79, 14);
		add(lblNombre);
		
		lblComponentes = new JLabel("Componentes:");
		lblComponentes.setBounds(28, 90, 103, 14);
		add(lblComponentes);
		
		lblUrl = new JLabel("URL:");
		lblUrl.setBounds(28, 196, 46, 14);
		add(lblUrl);
		
		lblNota = new JLabel("Nota:");
		lblNota.setBounds(28, 221, 46, 14);
		add(lblNota);
		
		lbArea = new JLabel("\u00C1rea:");
		lbArea.setBounds(28, 246, 46, 14);
		add(lbArea);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(28, 271, 46, 14);
		add(lblCurso);
		
		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(28, 296, 46, 14);
		add(lblGrupo);
	}

}//Fin clase PProyIntegBasico

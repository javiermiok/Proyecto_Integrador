package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelInicio extends JPanel {
	private JLabel lblLogo;

	public PanelInicio() {
		super();
		setLayout(null);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(PanelInicio.class.getResource("/images/logo.png")));
		lblLogo.setBounds(43, 53, 560, 360);
		add(lblLogo);
		inicializar();
	}

	private void inicializar() {
		// TODO Auto-generated method stub
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}

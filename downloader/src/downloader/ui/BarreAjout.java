package downloader.ui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class BarreAjout extends JPanel {
	JTextField url;
	JButton accept;
	JToolBar barre;

	public BarreAjout(JPanel p) {
		url = new JTextField();
		accept = new JButton("ajouter");
		setLayout(new BorderLayout());
		accept.addActionListener(new EcouteurBoutonAjout(url,p));
		barre=new JToolBar();
		barre.setFloatable(false);
		barre.add(url);
		barre.add(accept);
		add(barre);
	}
	
}

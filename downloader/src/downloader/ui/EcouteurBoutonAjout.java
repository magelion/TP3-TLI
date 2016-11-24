package downloader.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class EcouteurBoutonAjout implements ActionListener{
	
	JTextField url;
	JPanel pan;
	
	public EcouteurBoutonAjout(JTextField url,JPanel p) {
		this.url=url;
		pan=p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pan.add(new DownloadBar(url.getText()));
		pan.revalidate();
		
	}
}

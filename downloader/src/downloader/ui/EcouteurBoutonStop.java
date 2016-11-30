package downloader.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import downloader.fc.Downloader;

public class EcouteurBoutonStop implements ActionListener{


	Downloader download;
	JPanel conteneur;
	DownloadBar barre;
	
	public EcouteurBoutonStop(Downloader d,JPanel p,DownloadBar b) {
		download = d;
		conteneur=p;
		barre=b;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		download.cancel(false);
		conteneur.remove(barre);
		conteneur.updateUI();
	}

}	


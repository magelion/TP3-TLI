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
		// TODO Auto-generated constructor stub
		download = d;
		conteneur=p;
		barre=b;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		download.cancel(true);
		conteneur.remove(barre);
		conteneur.revalidate();
	}

}	


package downloader.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import downloader.fc.Downloader;

public class DownloadBar extends JPanel {

	JProgressBar telechargement;
	Downloader download;
	JButton play_pause;
	JButton stop;
	JLabel nom;
	JPanel pGauche;
	JPanel pDroite;
	
	public DownloadBar(String url,JPanel p) {
		super(new BorderLayout());
		pGauche=new JPanel();
		pDroite=new JPanel();
		pGauche.setLayout(new StackLayout());
		pDroite.setLayout(new FlowLayout());
		nom = new JLabel(url);
		
		telechargement = new JProgressBar();
		telechargement.setBorderPainted(true);
		telechargement.setStringPainted(true);
		
		pGauche.add(nom);
		pGauche.add(telechargement);
		download = new Downloader(url);
		download.execute();
		play_pause=new JButton("Play");
		play_pause.addActionListener(new EcouteurBoutonPP(download,play_pause));
		pDroite.add(play_pause);
		stop=new JButton("Stop");
		stop.addActionListener(new EcouteurBoutonStop(download,p,this));
		pDroite.add(stop);
		
		add(pGauche,BorderLayout.CENTER);
		add(pDroite,BorderLayout.EAST);
		
		download.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				telechargement.setValue(download.getProgress());
				telechargement.setString(download.getProgress() + " %");
			}
		});	
		 
	}
}

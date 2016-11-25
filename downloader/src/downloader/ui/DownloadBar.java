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
	//Thread fil;
	JPanel pGauche;
	JPanel pDroite;
	
	public DownloadBar(String url) {
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
		
		play_pause=new JButton("II / |> ");
		play_pause.addActionListener(new EcouteurBoutonPP(download));
		pDroite.add(play_pause);
		stop=new JButton("Stop");
		stop.addActionListener(new EcouteurBoutonStop(download));
		pDroite.add(stop);
		
		//add(telechargement,BorderLayout.CENTER);
		add(pGauche,BorderLayout.CENTER);
		add(pDroite,BorderLayout.EAST);
		download = new Downloader(url);

		
		//fil = new Thread(download);
		download.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				telechargement.setValue(download.getProgress());
				telechargement.setString(download.getProgress() + " %");
			}
		});	
		download.execute();

		//fil.start();
	}

}

package downloader.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import downloader.fc.Downloader;


public class Main {
	public static void main(String[] argv){
		
		JFrame fenetre = new JFrame("Downloader");
		
		JProgressBar telechargement = new JProgressBar();
		telechargement.setBorderPainted(true);
		telechargement.setStringPainted(true);
		
		Downloader d = new Downloader(argv[0]);
		Thread tdown = new Thread(d);
		tdown.start();
		d.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				telechargement.setValue(d.getProgress());
				telechargement.setString(d.getProgress()+" %");
				
			}
		});
		
		
		
		fenetre.add(telechargement);
		fenetre.pack();
		fenetre.setVisible(true);
	}
}	

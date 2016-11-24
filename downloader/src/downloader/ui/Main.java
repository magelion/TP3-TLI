package downloader.ui;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import downloader.fc.Downloader;


public class Main {
	public static void main(String[] argv){
		
		JFrame fenetre = new JFrame("Downloader");
		JPanel contenu = new JPanel(new StackLayout());
		fenetre.setLayout(new BorderLayout());
		fenetre.add(contenu,BorderLayout.CENTER);
		

		contenu.add(new DownloadBar(argv[0]));

		
		fenetre.add(new BarreAjout(contenu),BorderLayout.PAGE_END);
		
		fenetre.pack();
		fenetre.setVisible(true);
	}
}	

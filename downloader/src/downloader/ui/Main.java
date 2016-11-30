package downloader.ui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {
	public static void main(String[] argv){
		
		JFrame fenetre = new JFrame("Downloader");
		JPanel contenu = new JPanel(new StackLayout());
		fenetre.setLayout(new BorderLayout());
		fenetre.add(contenu,BorderLayout.CENTER);
		

		contenu.add(new DownloadBar(argv[0],contenu));

		
		fenetre.add(new BarreAjout(contenu),BorderLayout.PAGE_END);
		
		fenetre.pack();
		//fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fenetre.setVisible(true);
	}
}	

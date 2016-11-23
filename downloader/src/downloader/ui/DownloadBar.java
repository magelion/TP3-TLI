package downloader.ui;

import javax.swing.JComponent;
import javax.swing.JProgressBar;

import downloader.fc.Downloader;

public class DownloadBar extends JComponent  {
	
	JProgressBar telechargement;
	Downloader download;
	Thread fil;
	
	public DownloadBar(String url){
		telechargement = new JProgressBar();
		telechargement.setBorderPainted(true);
		telechargement.setStringPainted(true);
		download = new Downloader(url);
		
		}
}

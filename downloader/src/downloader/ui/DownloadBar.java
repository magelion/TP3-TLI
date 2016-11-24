package downloader.ui;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

import downloader.fc.Downloader;

public class DownloadBar extends JPanel {

	JProgressBar telechargement;
	Downloader download;
	Thread fil;

	public DownloadBar(String url) {
		super(new BorderLayout());
		telechargement = new JProgressBar();
		telechargement.setBorderPainted(true);
		telechargement.setStringPainted(true);
		add(telechargement,BorderLayout.CENTER);

		download = new Downloader(url);
		fil = new Thread(download);
		download.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				telechargement.setValue(download.getProgress());
				telechargement.setString(download.getProgress() + " %");

			}
		});
		fil.start();
	}

}

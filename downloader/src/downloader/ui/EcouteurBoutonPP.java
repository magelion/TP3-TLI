package downloader.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.sun.corba.se.spi.orbutil.fsm.State;

import downloader.fc.Downloader;

public class EcouteurBoutonPP implements ActionListener{

	Downloader download;
	Boolean run;
	JButton button;

	public EcouteurBoutonPP(Downloader d , JButton b) {
		download = d;
		run = true;
		button = b;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(run){
			download.pause();
			button.setText("Pause");
		}else{
			download.play();
			button.setText("Play");
		}
		run = !run;
	}

}

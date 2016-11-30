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
		// TODO Auto-generated constructor stub
		download = d;
		run = true;
		button = b;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		/*System.out.println(download.getState());
		switch(download.getState()){
		case PENDING:
			System.out.println("EN pause");
			download.Play();
			break;
		case STARTED :
			System.out.println("EN COUR");
			download.Pause();
			break;
		case DONE :
			System.out.println("FINI");
			break;
		default	: 
		}*/
		if(run){
			download.Pause();
			button.setText("Pause");
		}else{
			download.Play();
			button.setText("Play");
		}
		run = !run;
	}

}

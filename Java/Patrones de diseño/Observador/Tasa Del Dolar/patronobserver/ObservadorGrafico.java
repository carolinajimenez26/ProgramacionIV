package org.raydelto.patronobserver.observadores;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import org.raydelto.patronobserver.observables.TasaDelDolar;

public class ObservadorGrafico implements Observer{

	public void update(Observable observable, Object value) {
		JOptionPane.showMessageDialog(null, "La nueva tasa del dolar es " + 
				((TasaDelDolar)observable).getTasaDelDolar(),"Tasa Del Dolar",  JOptionPane.INFORMATION_MESSAGE);
	}

}

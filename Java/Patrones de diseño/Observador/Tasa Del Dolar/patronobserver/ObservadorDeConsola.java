package org.raydelto.patronobserver.observadores;

import java.util.Observable;
import java.util.Observer;

import org.raydelto.patronobserver.observables.TasaDelDolar;

public class ObservadorDeConsola implements Observer{

	public void update(Observable observable, Object value) {
		System.out.println("La nueva tasa del dolar es " + 
				((TasaDelDolar)observable).getTasaDelDolar());
	}

}

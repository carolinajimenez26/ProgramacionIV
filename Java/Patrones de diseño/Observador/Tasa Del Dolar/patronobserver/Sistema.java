package org.raydelto.patronobserver;

import org.raydelto.patronobserver.observables.TasaDelDolar;
import org.raydelto.patronobserver.observadores.ObservadorDeConsola;
import org.raydelto.patronobserver.observadores.ObservadorGrafico;

public class Sistema {
	public static void main(String[] args) {
		TasaDelDolar tasa = new TasaDelDolar();
		ObservadorDeConsola observadorConsola = new  ObservadorDeConsola();
		ObservadorGrafico observadorGrafico = new ObservadorGrafico();
		tasa.addObserver(observadorConsola);
		tasa.addObserver(observadorGrafico);
		tasa.setTasaDelDolar(36.10);
		tasa.notifyObservers();
	}
}

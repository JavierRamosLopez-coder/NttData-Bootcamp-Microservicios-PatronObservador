package com.nttdata.bootcamp.microservicios.patronobservador.patronObservador;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Clase Taller1
 * 
 * @author jramlope
 *
 */
public class Taller1 {
	
	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {

		/** Creación de un objeto de la clase Observable, para su posterior llamada
		 * al método just y el paso por parámetros de cadenas de texto **/
		Observable<String> mensaje = Observable.just("Javier", "Ramos", "López");

		/** Llamada al método subscribe para trabajar con los Observadores **/
		mensaje.subscribe(new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observador suscrito");
			}

			@Override
			public void onNext(String dato) {
				System.out.println("Observador recibido " + dato);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Fallo en el observador : " + e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("Observador completado");
			}

		});
	}

}

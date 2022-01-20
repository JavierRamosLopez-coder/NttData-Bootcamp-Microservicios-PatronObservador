package com.nttdata.bootcamp.microservicios.patronobservador.patronObservador;

import reactor.core.publisher.Flux;

/**
 * Clase Taller2
 * 
 * @author jramlope
 *
 */
public class Taller2 {

	/**
	 * Método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Creación de un objeto de la clase Flux, para su posterior uso del método just
		 **/
		Flux<String> mensaje = Flux.just("Javier", "Ramos", "López");

		// mensaje.subscribe(message -> System.out.println("Observer 1. " + mensaje));

		/** Uso del método doOnNext que se va a encargar de mostrar los 
		 * paramétros del método just**/
		mensaje.doOnNext((e) -> {
			System.out.println(e);
		}).blockLast();

	}

}

package br.com.multiplos;

public class Calcular {

	public static void main(String[] args) {
		Multiplo mult = MultiploFactory.createMultiplo();
		mult.numerMultiplo();
		mult.numeroIntervalo();
		mult.printMultiplo();
	}

}

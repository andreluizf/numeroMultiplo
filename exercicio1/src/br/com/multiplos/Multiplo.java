package br.com.multiplos;

public class Multiplo {
	private Numero n;
	private Intervalo i;

	public void numerMultiplo() {
		n = NumeroFactory.createNumero();
		n.inserirNumero();
	}

	public void numeroIntervalo() {
		i = IntervaloFactory.createIntervalo();
		i.intervalo();

	}

	public void printMultiplo() {
		printMultiplos(n.getMultiplo(), i.getInicio(), i.getFim());
	}

	public void printMultiplos(int m, int x, int y) {

		if (m >= x && m <= y) {
			System.out.println(m);
			printMultiplos(m + n.getMultiplo(), x, y);
		} else if (m <= y) {
			printMultiplos(m + n.getMultiplo(), x, y);
		}
	}
}

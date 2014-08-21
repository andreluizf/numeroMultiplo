package br.com.multiplos;


import javax.swing.JOptionPane;

public class Calcular {
	private static Numero n;
	private  static Intervalo i;

	private static void printMultiplos(int m, int x, int y) {
		
		if (m >= x && m <= y) {
			System.out.println(m);
			printMultiplos(m + n.getMultiplo(), x, y);
		} else if (m <= y) {
			printMultiplos(m +  n.getMultiplo(), x, y);
		}
	}

	public static void main(String[] args) {

		n=new Numero();
		i=new Intervalo();
		int p;
		while (!n.validaMultiplo()) {
			JOptionPane.showMessageDialog(null, "Numero Invalido");
		}

		while (!i.validaIntervalo()) {
			JOptionPane.showMessageDialog(null, "Numero Invalido");
		}

		printMultiplos(n.getMultiplo(), i.getInicio(), i.getFim());
	}

}

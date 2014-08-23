package br.com.multiplos;

import javax.swing.JOptionPane;

public class Numero {
	private int multiplo;

	public Numero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Numero(int multiplo) {
		super();
		this.multiplo = multiplo;
	}

	public int getMultiplo() {
		return multiplo;
	}

	public void inserirNumero() {
		while (!validaMultiplo()) {
			JOptionPane.showMessageDialog(null, "Numero Invalido");
		}

	}

	public boolean validaMultiplo() {

		try {
			String num = JOptionPane.showInputDialog("Digite o  multiplo: ");
			multiplo = Integer.parseInt(num);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}

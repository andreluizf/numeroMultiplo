package br.com.multiplos;

import javax.swing.JOptionPane;

public class Intervalo {
	private int inicio;
	private int fim;

	public Intervalo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intervalo(int inicio, int fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}

	public int getInicio() {
		return inicio;
	}

	public int getFim() {
		return fim;
	}

	public boolean validaIntervalo() {

		try {
			String num = JOptionPane
					.showInputDialog("Digite o  intervalo: ex: 2;10 ");
			String[] x = num.split(";");
			inicio = Integer.parseInt(x[0]);
			fim = Integer.parseInt(x[1]);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}

package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {

	private ItemCompra[] itensCompra;
	private int qtdeMax;
	
	public ListaCompra(int qtdMax) {	
		itensCompra = new ItemCompra[qtdMax];
	}
	
	public void incluir(ItemCompra item) {
		
		for(int num = 0; num <= itensCompra.length; num++) {
			itensCompra[num] = item;	
		}	
	}
	
	public double calcularPreco() {
		return 0;
	}

}

package br.interfaces;

public class Calculadora implements Calculos {

	@Override
	public Double soma(Double x, Double y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public Double subracao(Double x, Double y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public Double multiplicacao(Double x, Double y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	
	

}

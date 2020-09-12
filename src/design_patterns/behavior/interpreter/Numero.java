package design_patterns.behavior.interpreter;

public class Numero implements Expressao{
	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}
	
}

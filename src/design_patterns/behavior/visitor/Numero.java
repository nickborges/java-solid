package design_patterns.behavior.visitor;

public class Numero implements Expressao {
	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void visita(Visitor visitor) {
		visitor.visitaNumero(this);
	}
}

package design_patterns.behavior.visitor;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int resultadoDaEsquerda = esquerda.avalia();
		int resultadoDaDireita = direita.avalia();
		return resultadoDaEsquerda * resultadoDaDireita;
	}

	@Override
	public void visita(Visitor visitor) {
		visitor.visitaMultiplicacao(this);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}
}
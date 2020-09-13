package design_patterns.behavior.visitor;

public class Subtracao implements Expressao {
	private Expressao esquerda;
	private Expressao direita;
	
	public Subtracao(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
		
	}
	
	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		return valorDaEsquerda - valorDaDireita;
	}

	@Override
	public void visita(Visitor visitor) {
		visitor.visitaSubtracao(this);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}
}

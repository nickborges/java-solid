package design_patterns.behavior.visitor;

public interface Expressao {
	int avalia();
	void visita(Visitor visitor);
}

package design_patterns.behavior.interpreter;

public class Main {

	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));

		Expressao soma = new Soma(esquerda,direita);
		int resultado = soma.avalia();
		System.out.println(resultado);

		Expressao mult = new Multiplicacao(esquerda,direita);
		int result = mult.avalia();
		System.out.println(result);

	}
}

package design_patterns.behavior.observer;

public class EnviadorDeEmail implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf){
		System.out.println("enviei email");
	}
}

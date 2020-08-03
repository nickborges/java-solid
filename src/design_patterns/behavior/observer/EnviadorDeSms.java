package design_patterns.behavior.observer;

public class EnviadorDeSms implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf){
		System.out.println("enviei sms");
	}
}

package design_patterns.behavior.observer;

public class NotaFiscalDao implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf){
		System.out.println("salvei no banco");
	}
}

package design_patterns.behavior.templateMethod.exemplo2;

import java.util.List;

public abstract class Relatorio {
    protected abstract void cabecalho();
    protected abstract void corpo(List<Conta> contas);
    protected abstract void rodape();

    public void imprime(List<Conta> contas){
        cabecalho();
        corpo(contas);
        rodape();
    }
}

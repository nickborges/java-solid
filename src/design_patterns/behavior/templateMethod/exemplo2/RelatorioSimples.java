package design_patterns.behavior.templateMethod.exemplo2;

import java.util.List;

public class RelatorioSimples extends Relatorio{

    @Override
    protected void cabecalho() {
        System.out.println("descrição do cabeçalho.");
    }

    @Override
    protected void corpo(List<Conta> contas) {
        contas.forEach(c -> System.out.println(c));
    }

    @Override
    protected void rodape() {
        System.out.println("descrição do roda pé.");
    }
}

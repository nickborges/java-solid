package design_patterns.behavior.templateMethod.exemplo2;

import java.util.List;

public class RelatorioCompleto extends Relatorio{

    @Override
    protected void cabecalho() {
        System.out.println("Detalhes do cabecalho.");
        System.out.println("Descrição do cabecalho.");
    }

    @Override
    protected void corpo(List<Conta> contas) {
        contas.forEach(c -> System.out.println(c));
    }

    @Override
    protected void rodape() {
        System.out.println("Descrição do roda pé.");
        System.out.println("Contatos do roda pé.");
    }
}

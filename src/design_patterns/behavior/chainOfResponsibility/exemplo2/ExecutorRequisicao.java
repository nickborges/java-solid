package design_patterns.behavior.chainOfResponsibility.exemplo2;

public class ExecutorRequisicao {

    public void executor(Requisicao requisicao, Conta conta){
        Resposta r1 = new RequisicaoCSV();
        Resposta r2 = new RequisicaoXML();
        Resposta r3 = new RequisicaoPorcentagem();
        Resposta r4 = new SemRetorno();

        r1.proximo(r2);
        r2.proximo(r3);
        r3.proximo(r4);

        r1.responde(requisicao, conta);
    }
}

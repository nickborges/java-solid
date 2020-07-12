package design_patterns.chainOfResponsibility.exemplo2;

public class RequisicaoPorcentagem implements Resposta{

    private Resposta resposta;

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.PORCENTO){
            System.out.println(conta.getTitular() + "%" + conta.getSaldo());
        } else{
            resposta.responde(requisicao, conta);
        }
    }

    @Override
    public void proximo(Resposta resposta) {
        this.resposta = resposta;
    }
}

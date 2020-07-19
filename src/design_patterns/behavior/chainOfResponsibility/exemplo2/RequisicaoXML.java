package design_patterns.behavior.chainOfResponsibility.exemplo2;

public class RequisicaoXML implements Resposta{

    private Resposta resposta;

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.XML){
            System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
        } else{
            resposta.responde(requisicao, conta);
        }
    }

    @Override
    public void proximo(Resposta resposta) {
        this.resposta = resposta;
    }
}

package design_patterns.behavior.chainOfResponsibility.exemplo3;

public class StatusPendente implements Status{

    private Status status;

    @Override
    public ControleSuspensaoEntity mudar(ControleSuspensaoEntity controle, TentativasEntity tentativas, Response res) {
        if(res.getStatusHttp() != 201 && controle.getQtd() < tentativas.getLimite()){
            controle.alterarStatus(StatusEnum.PENDENTE_ENVIO);
            return controle;
        }
        return status.mudar(controle, tentativas, res);
    }

    @Override
    public void proximo(Status status) {
        this.status = status;
    }
}

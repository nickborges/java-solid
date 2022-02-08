package design_patterns.behavior.chainOfResponsibility.exemplo3;

public class MarcadorStatus {

    public ControleSuspensaoEntity executar(ControleSuspensaoEntity controle, TentativasEntity tentativas, Response res){
        Status sucesso = new StatusSucesso();
        Status pendente = new StatusPendente();
        Status erro = new StatusErro();

        sucesso.proximo(pendente);
        pendente.proximo(erro);
        return sucesso.mudar(controle, tentativas, res);
    }
}

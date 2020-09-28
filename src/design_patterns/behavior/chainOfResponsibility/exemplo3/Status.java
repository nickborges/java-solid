package design_patterns.behavior.chainOfResponsibility.exemplo3;

public interface Status {

    ControleSuspensaoEntity mudar(ControleSuspensaoEntity controle, TentativasEntity tentativas, Response res);
    void proximo(Status status);

}

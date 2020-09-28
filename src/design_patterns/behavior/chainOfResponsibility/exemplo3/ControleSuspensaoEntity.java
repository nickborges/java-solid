package design_patterns.behavior.chainOfResponsibility.exemplo3;

public class ControleSuspensaoEntity {

    private Long id;
    private int qtd;
    private StatusEnum statusEnum;

    public ControleSuspensaoEntity(Long id, int qtd) {
        this.id = id;
        this.qtd = qtd;
        this.statusEnum = StatusEnum.PENDENTE_ENVIO;
    }

    public Long getId() {
        return id;
    }

    public int getQtd() {
        return qtd;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void alterarStatus(StatusEnum statusEnum){
        this.statusEnum = statusEnum;
    }

    @Override
    public String toString() {
        return "ControleSuspensaoEntity{" +
                "id=" + id +
                ", qtd=" + qtd +
                ", statusEnum=" + statusEnum +
                '}';
    }
}

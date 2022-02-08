package design_patterns.behavior.chainOfResponsibility.exemplo3;

public class Request {
    private String cpf;
    private String assessoria;
    private String contrato;

    public Request(String cpf, String assessoria, String contrato) {
        this.cpf = cpf;
        this.assessoria = assessoria;
        this.contrato = contrato;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAssessoria() {
        return assessoria;
    }

    public String getContrato() {
        return contrato;
    }
}

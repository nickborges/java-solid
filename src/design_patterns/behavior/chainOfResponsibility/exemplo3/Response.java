package design_patterns.behavior.chainOfResponsibility.exemplo3;

public class Response {

    private int statusHttp;
    private String mensagem;

    public Response(int statusHttp, String mensagem) {
        this.statusHttp = statusHttp;
        this.mensagem = mensagem;
    }

    public int getStatusHttp() {
        return statusHttp;
    }

    public String getMensagem() {
        return mensagem;
    }
}

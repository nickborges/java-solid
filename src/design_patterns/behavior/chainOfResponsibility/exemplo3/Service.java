package design_patterns.behavior.chainOfResponsibility.exemplo3;

public class Service {

    public static void main(String[] args) {
        //parâmetros de entrada
        Request req = new Request("123", "123", "123");
        Response res = new Response(201, "123456789");

        //incrementar a tentativa e
        //carregar o controle da base
        ControleSuspensaoEntity controle = new ControleSuspensaoEntity(1L, 2);

        //carregar tentativas da base(tabela dominio)
        TentativasEntity tentativas = new TentativasEntity(2);

        //lógica de mudar o status
        ControleSuspensaoEntity resultado = new MarcadorStatus().executar(controle, tentativas, res);
        System.out.println(resultado);

        //persistir o controle
        //persistir o evento

    }
}

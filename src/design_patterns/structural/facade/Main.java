package design_patterns.structural.facade;

public class Main {

    public static void main(String[] args) {

        EmpresaFacade facade = new EmpresaFacade();
        facade.buscarCliente("cpf");
        facade.criarFatura(new Cliente("Fulano", "..."), 500.0);



    }
}

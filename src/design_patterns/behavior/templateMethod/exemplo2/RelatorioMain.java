package design_patterns.behavior.templateMethod.exemplo2;

import java.util.Arrays;

public class RelatorioMain {

    public static void main(String[] args) {
        Relatorio simples = new RelatorioSimples();
        simples.imprime(Arrays.asList(
                new Conta("Fulano1","123","001"),
                new Conta("Fulano2","223","001"),
                new Conta("Fulano3","423","001")
        ));

        Relatorio completo = new RelatorioCompleto();
        completo.imprime(Arrays.asList(
                new Conta("Fulano1","123","001"),
                new Conta("Fulano2","223","001"),
                new Conta("Fulano3","423","001")
        ));
    }
}

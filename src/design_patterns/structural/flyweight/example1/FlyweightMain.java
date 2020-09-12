package design_patterns.structural.flyweight.example1;

import java.util.Arrays;
import java.util.List;

public class FlyweightMain {

    public static void main(String[] args) {
        NotasMusicais notas = new NotasMusicais();
        Piano piano = new Piano();
        List<Nota> todasAsNotas = Arrays.asList(
                notas.pega("do"),
                notas.pega("doSustenido"),
                notas.pega("re"),
                notas.pega("reSustenido"),
                notas.pega("mi"),
                notas.pega("miSustenido"),
                notas.pega("fa"),
                notas.pega("faSustenido"),
                notas.pega("sol"),
                notas.pega("solSustenido"),
                notas.pega("la"),
                notas.pega("laSustenido"),
                notas.pega("si"),
                notas.pega("siSustenido")
        );

        piano.toca(todasAsNotas);

    }
}

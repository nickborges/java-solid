package design_patterns.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {

    private List<Comando> comandos = new ArrayList<>();

    public void adiciona(Comando comando){
        comandos.add(comando);
    }

    public void processo(){
        comandos.forEach(c -> {
            c.executar();
        });
    }
}

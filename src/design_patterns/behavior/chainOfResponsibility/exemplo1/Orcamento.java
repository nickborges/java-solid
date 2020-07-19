package design_patterns.behavior.chainOfResponsibility.exemplo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Orcamento {

    private final double valor;
    private List<Item> itens = new ArrayList<>();

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item){
        this.itens.add(item);
    }

    public List<Item> getItens(){
        return Collections.unmodifiableList(itens);
    }

    public boolean contemItemPorNome(String nome){
        return this.itens
                .stream()
                .filter(f -> f.getNome().equals(nome))
                .collect(Collectors.toList())
                .size() > 0;
    }
}

package design_patterns.strategy.exemplo2;

public class Cachorro implements AnimalStrategy {

    @Override
    public String comer(String comida) {
        return comida;
    }

    @Override
    public String vacinar(String vacina) {
        return vacina;
    }
}

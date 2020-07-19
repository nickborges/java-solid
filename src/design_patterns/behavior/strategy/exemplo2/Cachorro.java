package design_patterns.behavior.strategy.exemplo2;

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

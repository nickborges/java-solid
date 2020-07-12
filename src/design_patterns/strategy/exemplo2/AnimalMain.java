package design_patterns.strategy.exemplo2;

public class AnimalMain {

    public static void main(String[] args) {
        AnimalContexto animalContexto = new AnimalContexto();

        animalContexto.comer("Milho", new Cavalo());
        animalContexto.comer("Milho", new Cavalo());

        animalContexto.comer("Ração", new Cachorro());

    }
}

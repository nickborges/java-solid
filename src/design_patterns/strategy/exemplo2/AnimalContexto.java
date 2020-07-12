package design_patterns.strategy.exemplo2;

public class AnimalContexto {

    public String comer(String comida, AnimalStrategy animalStrategy){
        System.out.println("Animal: " + animalStrategy.getClass().getSimpleName() + " - come: " + comida);
        return animalStrategy.comer(comida);
    }
}

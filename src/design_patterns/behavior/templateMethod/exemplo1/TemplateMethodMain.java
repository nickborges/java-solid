package design_patterns.behavior.templateMethod.exemplo1;

public class TemplateMethodMain {

    public static void main(String[] args) {
        TemplateImpostoCondicional template1 = new ICCP();
        double resultado1 = template1.calcular(new Orcamento(600));
        double resultado2 = template1.calcular(new Orcamento(500));

        System.out.println("Desconto Máximo: " + resultado1);
        System.out.println("Desconto Mínimo: " + resultado2);

        TemplateImpostoCondicional template2 = new IKCV();
        double resultado3 = template2.calcular(new Orcamento(600));
        double resultado4 = template2.calcular(new Orcamento(500));

        System.out.println("Desconto Máximo: " + resultado3);
        System.out.println("Desconto Mínimo: " + resultado4);

    }
}

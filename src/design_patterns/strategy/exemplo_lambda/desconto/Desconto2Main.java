package design_patterns.strategy.exemplo_lambda.desconto;

import java.math.BigDecimal;

public class Desconto2Main {

    public static void main(String[] args) {
        BigDecimal vintePorcento = BigDecimal.valueOf(0.2);
        BigDecimal cinquentaPorcento = BigDecimal.valueOf(0.5);
        BigDecimal valor = BigDecimal.valueOf(1000);

        //da para reduzir ainda mais a verbosidade
        Desconto2 des2 = q -> q.multiply(vintePorcento);
        BigDecimal des = des2.apply(valor);
        System.out.println("Desconde de:" + des);

        Desconto2Contexto contexto = new Desconto2Contexto();
        BigDecimal resultado = contexto.descontar(q -> q.multiply(vintePorcento), valor);
        System.out.println("Desconte de:" + resultado);

    }
}

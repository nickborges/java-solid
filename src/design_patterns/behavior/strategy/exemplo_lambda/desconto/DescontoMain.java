package design_patterns.behavior.strategy.exemplo_lambda.desconto;

import java.math.BigDecimal;

public class DescontoMain {

    public static void main(String[] args) {
        BigDecimal valor = BigDecimal.valueOf(1000);

        //o problema aqui é que o desconto está fixo e se entrar outro tipo de desconto ?
        Desconto.vintePorcento().descontar(valor);
        Desconto.trintaPorcento().descontar(valor);
        Desconto.cinquentaPorcento().descontar(valor);


    }
}
